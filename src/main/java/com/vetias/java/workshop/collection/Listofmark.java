package com.vetias.java.workshop.collection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Listofmark {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(90);
        marks.add(78);
        marks.add(92);
        marks.add(88);
        marks.sort(Comparator.naturalOrder());
        System.out.println("Sorted List of Marks in ascending: " + marks);
        marks.sort( Comparator.reverseOrder());
        System.out.println("Sorted List of Marks in descending: " + marks);
        System.out.println("Maximum mark:"+marks.get(0));
    }
}
