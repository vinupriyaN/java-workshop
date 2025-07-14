package com.vetias.java.workshop.collection;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class Marklist {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(85, 90, 78, 92, 88);
        System.out.println("List of marks in ascending: " );
        marks.stream().sorted().forEach( System.out::println);
         System.out.println("List of marks in descending: " );
        marks.stream().sorted(Comparator.reverseOrder()).forEach( System.out::println);
        System.out.println("maximum mark:");
        Optional<Integer> mark=marks.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println(mark);
    }
}
