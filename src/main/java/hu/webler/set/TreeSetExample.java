package hu.webler.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(30);

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}