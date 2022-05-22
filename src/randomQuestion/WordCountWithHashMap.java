package randomQuestion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordCountWithHashMap {
    public static void main(String[] args) {
        Map<String, Integer> count = new HashMap<>();

        String sentence = "esther is a good girl esther is my good friend";
        String[] stringArray = sentence.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            if (count.containsKey(stringArray[i])){
                count.put(stringArray[i], count.get(stringArray[i])+1);
            }else count.put(stringArray[i], 1);
        }
        System.out.println(count);


    }

}
