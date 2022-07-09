package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        //Queue<String> queue = new ArrayDeque<>();
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Ichwan");
        queue.add("Sholihin");
        queue.add("Qoonita");

        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
