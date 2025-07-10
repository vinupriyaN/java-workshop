package com.vetias.java.workshop.collection;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer, String> students= new HashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");   
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Eve");
        System.out.println("Student Map: " + students);
        System.out.println(students.keySet());
        System.out.println(students.values());

    }
    
}
