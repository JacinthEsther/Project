package turtle;

public class Sketchpad {
    private String[][] array = new String[5][5];

    public Sketchpad(String [] [] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                this.array = array;
            }
        }
    }
}
