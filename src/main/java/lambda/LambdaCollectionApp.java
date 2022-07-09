package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaCollectionApp {
    public static void main(String[] args) {
        //list immutable
        List<String> list = List.of("Ichwan","Sholihin","1931231");

        //list dengan method reference
        list.forEach(System.out::println);

        //list dengan lambda
        list.forEach(value -> System.out.println(value));

        //remove dengan lambda
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Lampung","Selatan","Bandralampung"));
        names.removeIf(name -> name.length()>8);
        System.out.println(names);

        Map<String, String> map = new HashMap<>();
        map.put("19312131","Ichwan");
        map.put("19312132","Abdul");
        map.put("19312133","Ahmad");

        map.forEach((key, value) -> System.out.println(key + "-" +value));
    }
}
