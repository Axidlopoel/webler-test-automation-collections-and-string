package hu.webler.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, Integer> keyValuePairs = new HashMap<>();

        keyValuePairs.put("Egy", 1);
        keyValuePairs.put("Kettő", 2);
        keyValuePairs.put("Három", 3);

        int value = keyValuePairs.get("Kettő");
        System.out.println(value);

        for (Map.Entry<String, Integer> entry : keyValuePairs.entrySet()) {
            System.out.println("Kulcs: " + entry.getKey() + " , érték: " + entry.getValue());
        }
    }
}