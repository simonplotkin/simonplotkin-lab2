import java.util.*;

public class DotChaser {
  public static Random rand = new Random(System.currentTimeMillis());
  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    ThingList list = new ThingList();
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {

        // Add a typeA thing to the list.
        // (GEE, THAT'S A LOT OF CODE FOR JUST CREATING ONE THING)
        Thing tA = new TypeA(45, 50);
        list.addThing(tA);

        // Add a typeB thing to the list
        Thing tB = new TypeB(55, 50);
        list.addThing(tB);

        Thing tC = new TypeC(56,50);
        list.addThing(tC);
      }

      // Print out each thing.
      // (SEEMS LIKE A NICE PRINTALL() METHOD CALL WOULD WORK HERE)
      // (SEEMS LIKE A toString() METHOD IN THE CLASS WOULD ALSO BE NICE)
      list.printAll();
      System.out.println("done");
      System.out.flush();

      // Move each thing.
      // (SEEMS LIKE A NICE MOVEALL() METHOD CALL WOULD WORK HERE)
      list.moveAll(rand);
      count++;
    }
  }
}
