package randomQuestion;

public class StringPalindromeCheck {
    public static void main(String[] args) {
        palindromeChecker("radar");
    }

    public static void palindromeChecker(String word){
        StringBuilder reverse= new StringBuilder();
        for (int i = word.length()-1; i >= 0; i--) {
            reverse.append(word.charAt(i));
        }
        if(reverse.toString().equals(word)){
            System.out.println(word + " is a palindrome");

        }
        else System.out.println(word + " is not a palindrome");
    }
}
