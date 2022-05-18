package randomQuestion;

import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        lists.add("Esther");
        lists.add("Jacinta");
        lists.add("Joy");
        lists.add("Blessing");

        for (String list : lists) {
            System.out.println(list);
        }
    }
}
