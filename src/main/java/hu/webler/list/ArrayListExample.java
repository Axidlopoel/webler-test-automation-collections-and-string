package hu.webler.list;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);

        for (Integer num : numbers) {
            System.out.println(num);
        }

        System.out.println(numbers.get(1));

        ArrayList<String> names = new ArrayList<>();
        names.add("James");
        System.out.println(names.getFirst());

        List<String> names2 = new Vector<>();
        names2.add("Bob");
        names2.add("Alice");
        names2.add("Charlie");

        Iterator<String> iterator = names2.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
