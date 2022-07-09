package collections;

import java.util.*;
/*map juga punya method immutable seperti set dan list
sortedmap juga sama seperti sortedset*/
public class MapApp {
    public static void main(String[] args) {

        Map<String, String> maps = new HashMap<>();

        //kalo mau liat proses iterasi nya pake ini, tapi lambat karena iterasi datanya satu-satu dan berurut
        //Map<String, String> maps = new LinkedHashMap<>();

        //jarang dipake, klo mau nyari reference identity bisa pake ini
        //Map<String, String> maps = new IdentityHashMap<>();

        //anonymous class
        Comparator<String> stringComparator = (o1, o2) -> o2.compareTo(o1);

        //SortedMap<String, String> maps = new TreeMap<>(stringComparator);

        //NavigableMap<String, String> maps = new TreeMap<>();
        maps.put("firstname","Ichwan");
        maps.put("middlename","Testing");
        maps.put("lastname","Sholihin");
        maps.put("firstname2","Abdullah");

        Set<String> keys = maps.keySet();
        for (var key: keys){
            System.out.println(key);
        }

//        System.out.println(maps.get("firstname"));
//        System.out.println(maps.values());
//        System.out.println(maps.size());
        //dari navigableMap
//        System.out.println(maps.lowerKey("middlename"));
//        System.out.println(maps.higherKey("middlename"));

        Set<Map.Entry<String, String>> entries = maps.entrySet();
        for (var value: entries){
            System.out.println(value.getValue());
        }

    }
}
