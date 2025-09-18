package app;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        
        Queue<String> pq = new PriorityQueue<>();
        
        pq.add("Omkar");
        pq.add("Cdac");
        pq.add("Knowit");
        pq.add("Pune");
        pq.add("Java");
        pq.add("CPP");

        System.out.println("Removing elements from PriorityQueue:");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
