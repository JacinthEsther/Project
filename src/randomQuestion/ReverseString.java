package randomQuestion;

public class ReverseString {
    public static void main(String[] args) {

        String word= "cohort_nine";
        for(int i=word.length()-1; i>=0; i--) {
            System.out.print(word.charAt(i) + " " );
        }
    }

}
