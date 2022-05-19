package randomQuestion;

public class ReversingAndReplacingString {
    public static void main(String[] args) {
        reverseAndReplace("patience");
    }

    public static void reverseAndReplace(String word){
        char[] token = "ta658vobh9".toCharArray();
        StringBuilder sb = new StringBuilder(word);
       String newWord = sb.reverse().toString();
        for (int i = 0; i < newWord.length(); i++) {
            for (char character : token) {
                if (newWord.charAt(i) == character) {
                    newWord = (newWord.replace(String.valueOf(newWord.charAt(i)), "--"));
                }
            }
        }
        System.out.println(newWord);
    }
}
