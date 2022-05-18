package randomQuestion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordCountWithHashMap {
    public static void main(String[] args) {
        Map<String, Integer> count = new HashMap<>();

        count.put("Esther", 1);
        count.put("Jacinta", 2);
        count.put("Joy", 3);
        count.put("Blessing", 4);

        for(Map.Entry<String, Integer> set:
        count.entrySet()) {
            System.out.println(set.getKey() + "=" + set.getValue());
        }


//        count.forEach((key, value)-> System.out.println(
//                key + " = " + value
//        ));


//
//        // Iterating every set of entry in the HashMap
//        for (Map.Entry<String, Integer> new_Map : count.entrySet()) {
//            // Displaying HashMap
//            System.out.println(new_Map.getKey() + " = "
//                    + new_Map.getValue());
//        }


    }

}
