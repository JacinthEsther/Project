package turtle;

public class Sketchpad {
    private int [][] array;

    public Sketchpad(int row, int column){
      array = new int[row][column];
    }

    public int [][] getSketchpad(){
        return array;
    }
}
