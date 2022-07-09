package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IterableApp {

    public static void main(String[] args) {

        //iterable hanya untuk menambahkan, tidak dapat dimanipulasi
        Iterable<Integer> iterable = List.of(12,14,11,20,13);

        for (var number: iterable){
            System.out.println(number);
        }

        //collection untuk memanipulasi data
        Collection<Integer> collection = new ArrayList<>();

        collection.add(6);
        collection.addAll(List.of(1,2,3,4,5));

        for (var value: collection){
            System.out.println(value);
        }
    }
}
