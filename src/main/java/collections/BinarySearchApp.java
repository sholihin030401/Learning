package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(50);
        for (int i = 0; i < 50; i++) {
            list.add(i);
        }

        //turunan dari class Collections ada banyak, cek documentation nya
        System.out.println(Collections.binarySearch(list, 46));
    }
}
