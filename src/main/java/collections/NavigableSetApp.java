package collections;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {

    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();

        names.addAll(Set.of("Ichwan","Sholhin","Software","Engineer","Natar"));

        //inclusive: apakah data "Ichwan" termasuk tail
        NavigableSet<String> tail = names.tailSet("Ichwan",true);

        for (var name : tail){
            System.out.println(name);
        }
    }
}
