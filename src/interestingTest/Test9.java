package interestingTest;

import java.util.HashSet;
import java.util.Set;

public class Test9 {
    public static void main(String[] args) {

        Set<String> strings = new HashSet<>();
        strings.add("C33");
        strings.add("A11");
        strings.add("B22");
        Set<String> strings1 = Set.of("C33".toLowerCase(),"A11".toUpperCase(),"B22".replace("2","1"));
        strings.addAll(strings1);
        System.out.println(strings.size());
    }
}
