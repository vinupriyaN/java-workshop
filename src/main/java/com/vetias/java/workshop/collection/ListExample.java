package com.vetias.java.workshop.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");
        names.add("Frank");
        names.add("Grace");
        System.out.println("Names List: " + names);
        names.set(2, "Chuck"); 
        names.remove(4);
        names.add(1, "Bella");
        names.contains("Alice");
        System.out.println("Updated Names List: " + names); 
        for (String name : names) 
        {
            System.out.println("Name: " + name);
        }
        for (int i = 0; i < names.size(); i++)
        {
            System.out.println("Name at index " + i + ": " + names.get(i));
        }
        names.forEach(System.out::println);
    }
    
}
