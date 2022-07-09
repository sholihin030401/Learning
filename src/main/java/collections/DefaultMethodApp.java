package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DefaultMethodApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("firstname", "ichwan");
        map.put("lastname", "sholihin");
        map.put("npm","19312131");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + " - " + s2);
            }
        });

        for (int i = 1; i <= 20 ; i++) {
            numbers.add(i);
        }

        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 3;
            }
        });

        System.out.println(numbers);

        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 != 0;
            }
        });

        System.out.println(numbers);
    }
}
