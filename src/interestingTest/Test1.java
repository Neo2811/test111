package interestingTest;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {

        Map<String,String> key = new HashMap<>();
        key.put("1","1");

        Map<Map<String,String>,String> map = new HashMap<>();
        map.put(key,"test");
        System.out.println(map);

        key.put("2","2");
        System.out.println(map.get(key));
        System.out.println(map);
    }
}
