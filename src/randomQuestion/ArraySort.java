package randomQuestion;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        arraySort(1,2,0,2,0,1,2,0,1,1,2,0);
    }
    public static void arraySort(int ... array){

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
