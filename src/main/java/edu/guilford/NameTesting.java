package edu.guilford;

import java.util.Arrays;
import java.util.PriorityQueue;

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
        FullName.sortOrder= FullName.SortOrder.FORWARD;
        // Sort the array of names using Arrays.sort
        Arrays.sort(names);

        System.out.println("\nAfter sorting");
        // Print out the array of names again
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Create a Priority Queue for the FullName objects
        PriorityQueue<FullName> pq = new PriorityQueue<FullName>();
        // Add 20 new FullName objects to the priority queue
        for (int i = 0; i < 20; i++) {
            pq.add(new FullName());
        }

        System.out.println("\nPriority Queue");
        // Print out the priority queue
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        System.out.println("Is the queue empty? " + pq.isEmpty());

    }
}
