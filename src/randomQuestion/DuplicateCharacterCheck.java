package randomQuestion;

public class DuplicateCharacterCheck {
    public static void main(String[] args) {
        checkForDuplicateCharacter("school");
    }

    public static void checkForDuplicateCharacter(String word){

        char[] string = word.toCharArray();
        System.out.println("the duplicate character is/are: ");
        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j < word.length() ; j++) {

                if(string[i]== string[j]){

                    System.out.println(string[j]);
                }

            }

        }
    }
}
