package randomQuestion;

public class PrimeNumber {
    public static void main(String[] args) {
      checkPrimeNumber(19);
    }

    public static void checkPrimeNumber(int number){
        int [] array = {2,3,5,7};
        int count=0;

        for (int j : array) {
            if (number % j == 0) count++;
        }

        if(count > 0) System.out.println(number +" is not a prime number");
        else System.out.println(number + " is a prime number");
    }
}
