import java.util.*;
public class ThingList {
    public Random rand = new Random(System.currentTimeMillis());

    private class Node {
        public Thing data;
        public Node next;

        public Node(Thing thing){
            this.data = thing;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    public ThingList(){
        count = 0;
    }

    public void addThing(Thing thing){
        Node newNode = new Node(thing);

        if(count == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    public void printAll() {
        Node iterator = head;

        while(iterator != null){
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
    }

    public void moveAll(Random rand) {
        Node iterator = head;

        while(iterator != null){
            iterator.data.maybeTurn(rand);
            iterator.data.step();

            iterator = iterator.next;
        }

    }




}
