package hu.webler.set;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DescTreeSetExample {

    public static void main(String[] args) {

        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(30);

        Set<Integer> sortedNums = new TreeSet<>(Comparator.reverseOrder());
        sortedNums.addAll(numbers);

        for (Integer num : sortedNums) {
            System.out.println(num);
        }
    }
}