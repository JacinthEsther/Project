package randomQuestion;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacciCalculate(9);
    }

    public static void fibonacciCalculate(int number){
        int num1 = 0, num2 = 1;

        int counter = 0;

        while (counter < number) {

            System.out.print(num1 + " ");


            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;

    }
    }
}
