package edu.guilford;

import java.util.Arrays;

public class NameTesting {
    public static void main(String[] args) {
        // Create an array of 10 FullName objects
        FullName[] names = new FullName[10];
        for (int i = 0; i < names.length; i++) {
            names[i] = new FullName();
        }
        System.out.println("Before sorting");
        // Print out the array of names
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        FullName.sortOrder= FullName.SortOrder.REVERSE;
        // Sort the array of names using Arrays.sort
        Arrays.sort(names);

        System.out.println("\nAfter sorting");
        // Print out the array of names again
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
