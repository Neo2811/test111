package interestingTest;

import java.util.ArrayList;
import java.util.Collection;

public class Test8 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("jdbc");
        list.add("json");
        list.add("jdbc");
        for (Object o: list) {
            if (o.equals("jdbc")) {
                o = "java";
            }
        }
        System.out.println(list);
    }
}
