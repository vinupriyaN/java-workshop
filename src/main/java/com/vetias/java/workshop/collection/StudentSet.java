package com.vetias.java.workshop.collection;
import java.util.HashSet;
import java.util.Set;
public class StudentSet {
    public static void main(String[] args) {
        Set<Integer> studentIds = new HashSet<>();
        studentIds.add(101);
        studentIds.add(102);
        studentIds.add(103);
        studentIds.add(104);    
        studentIds.add(105);
        System.out.println("Student IDs: " + studentIds);
    }
    
}
