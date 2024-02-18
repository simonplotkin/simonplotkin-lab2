import java.util.*;
public class TypeA extends Thing{

  public TypeA(int row, int col){
    this.row = row;
    this.col = col;
  }

  public void maybeTurn(Random r){
    int i = r.nextInt(3);

    if(i == 1) {
      rightTurn();
    }

    if (i == 2) {
      leftTurn();
    }
  } 
}
