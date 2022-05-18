package randomQuestion;

import java.security.SecureRandom;
import java.util.Arrays;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int max=50;
        int min =10;
        int [] [] [] threeDimensionalArray = new int[2][3][4];

        for (int i = 0; i < threeDimensionalArray.length; i++){
            for (int j = 0; j< threeDimensionalArray[i].length;j++){
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++){
                    threeDimensionalArray[i][j][k] =   random.nextInt(max-min +1) + min;
                }
            }
        }
        System.out.println(Arrays.deepToString(threeDimensionalArray));
    }

}
