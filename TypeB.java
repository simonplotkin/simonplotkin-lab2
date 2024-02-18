import java.util.*;
public class TypeB extends Thing{
  public int timeSinceLast;

  public TypeB(int row, int col) {
    this.row = row;
    this.col = col;
    this.lab = 'b';
  }

  public void maybeTurn(Random r){
    int i = r.nextInt(3);

    timeSinceLast++;

    if(timeSinceLast == 10) {
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
