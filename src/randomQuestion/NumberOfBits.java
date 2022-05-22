package randomQuestion;

public class NumberOfBits {

    public static void main(String[] args) {
        System.out.println(bitCheck(19));
    }
    public static int bitCheck(int n){

//            String bin = Integer.toBinaryString(n);
//            long count = bin.chars().filter(ch -> ch == '1').count();
//            return (int) count;


        long bin = Integer.bitCount(n);
        return (int) bin;


//        int [] arr = new int [10];
//        int count = 0;
//        int i=0;
//        while(n > 0){
//
//            arr[i] = n % 2;
//            n = n / 2;
//            i++;
//        }
//
//        for(i=0 ; i < arr.length; i++){
//            if(arr[i]> 0){
//                count++;
//            }
//        }
//        return count;
    }
}
