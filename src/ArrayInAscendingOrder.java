import java.util.Arrays;

public class ArrayInAscendingOrder {
    private static int temp;

    public static void main(String[] args) {
        int [] array = {3,4,2,1,6,4,9,7,0};
        for (int i = 0; i < array.length-1; i++) {
            if (array[i+1] < array[i]){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                for (int j = i; j >=0 ; j--) {
                    if (array[j] > array[j+1]){
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
