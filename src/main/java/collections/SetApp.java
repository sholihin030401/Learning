package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Bedanya Set dan List. Kalo set dia datanya unix, gk ada data duplikat, kalo List dia datanya bisa duplikat
public class SetApp {
    public static void main(String[] args) {
        //HashSet datanya gk berurut
        //Set<String> nama = new HashSet<>();

        //LinkedHashSet datanya berurut karena ada double linkedlist dibelakangnya
        Set<String> nama = new LinkedHashSet<>();
        nama.add("Ichwan");
        nama.add("Test");
        nama.add("Sholihin");
        nama.add("Test");

//        for (var name: nama){
//            System.out.println(name);
//        }

        Set<String> imutable = Collections.unmodifiableSet(nama);
        Set<String> prodi = Set.of("SI","IF");
        prodi.add("TK");

        for (var names: prodi){
            System.out.println(names);
        }


    }
}
