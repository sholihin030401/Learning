package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.addAll(List.of(1,3,6,82,8,4,6));
        Collections.sort(number);
        for (var num: number){
            System.out.println(num);
        }
    }
}
