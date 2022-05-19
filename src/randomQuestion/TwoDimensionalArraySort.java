package randomQuestion;

import java.util.Arrays;

public class TwoDimensionalArraySort {
    public static void main(String[] args) {
        int[][] array = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};

        // sort array
        sort(array);

//        // Display sorted array
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//        }
        System.out.println(Arrays.deepToString(array));
    }

    public static void sort(int[][] m){
        for (int i = 0; i < m.length - 1; i++) {
            int currentIndex = i;
            int[] current = m[i];
            for (int j = i +  1; j < m.length; j++) {
                if (current[0] > m[j][0] || current[0] == m[j][0] && current[1] > m[j][1]) {
                    current = m[j];
                    currentIndex = j;
                }
            }
            if (currentIndex != i) {
                m[currentIndex] = m[i];
                m[i] = current;
            }
        }

    }
}
