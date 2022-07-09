package collections;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayApp {
    public static void main(String[] args) {
        List<String> names = List.of("Ichwan","Sholihin","19312131");

        //utk bawa informasi generic dari listnya
        String[] strings = names.toArray(new String[]{});

        System.out.println(Arrays.toString(strings));
    }
}
