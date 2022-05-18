package randomQuestion;

import java.util.Arrays;

public class SecondHighestNumber {
    public static void main(String[] args) {
        secondHighestNumber(2,3,6,8,9,10);
    }

    public static void secondHighestNumber(int ... number){
        int secondHighestNumber=0;
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            secondHighestNumber = number[number.length-2];
        }
        System.out.println("The second highest number is "+secondHighestNumber);
    }
}
