package randomQuestion;

public class WhiteSpaceRemovalWithStringReplace {
    public static void main(String[] args) {
        StringReplace("I am coming back home");
    }

    public static void StringReplace(String word){

      String newWord=      word.replace(" ","");
        System.out.println(newWord);

    }
}
