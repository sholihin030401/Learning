package collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offerFirst("Ichwan");
        deque.offerFirst("Sholihin");
        deque.offerLast("Rajawali");
        deque.offerFirst("Testing");

        for (String next = deque.pollLast(); next != null; next = deque.pollLast()){
            System.out.println(next);
        }
    }
}
