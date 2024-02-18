import java.util.Random;

public class TypeC extends Thing{
    public int timeSinceLast;

    public TypeC(int row, int col){
        this.row = row;
        this.col = col;
        this.lab = 'y';
      }
    
    public void maybeTurn(Random r){
        int i = r.nextInt(3);

        timeSinceLast++;

        if(timeSinceLast == 5) {
            timeSinceLast = 0;
            if (i == 1) {
                rightTurn();
            }

            if(i == 2) {
                leftTurn();
            }
        }
    } 
}
