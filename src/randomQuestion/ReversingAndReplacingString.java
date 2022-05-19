package randomQuestion;

public class ReversingAndReplacingString {
    public static void main(String[] args) {
        reverseAndReplace("patience");
    }

    public static void reverseAndReplace(String word){
        char[] token = "ta658vobh9".toCharArray();
        StringBuilder sb = new StringBuilder(word);
       String newWord = sb.reverse().toString();
//        System.out.println(newWord);
       StringBuilder newNewWord = new StringBuilder();
        for (int i = 0; i < newWord.length(); i++) {
            for (int j = 0; j < token.length; j++) {
            if(newWord.charAt(i)== token[j]) {
                newNewWord = new StringBuilder(newWord.replace(String.valueOf(newWord.charAt(i)), "--"));
            }
            }
            newNewWord.append(newWord.charAt(i));
        }
        System.out.println(newNewWord);
    }
}
