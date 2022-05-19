package randomQuestion;

public class WhiteSpaceRemovalWithoutStringReplaceMethod {
    public static void main(String[] args) {
        spaceRemoval("i am going");
    }

    public static void spaceRemoval(String word){
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if(String.valueOf(word.charAt(i)).equals(" ")){
                continue;
            }
            newWord.append(word.charAt(i));
        }
        System.out.println(newWord);
    }
}
