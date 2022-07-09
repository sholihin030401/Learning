package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        //cara aksesnya sama aja karena sama-sama turunan dari Collection
        //arrayList cepat digunakan ketika memanipulasi data (set/get) karena tinggal akses indexnya
        List<String> arrayList = new ArrayList<>();
        //linkedList cepat digunakan ketika menambahkan/menghapus data karena tidak ada default kapasitas dan menghapus dari node (next/prev) nya
        //List<String> linkedList = new LinkedList<>();
        arrayList.add("Ichwan");
        arrayList.addAll(List.of("Sholihin", "Lampung", "Selatan"));
        arrayList.set(2, "Qonita");
        arrayList.remove(1);
        //System.out.println(arrayList.get(arrayList.size()));
        for (var value: arrayList){
            System.out.println(value);
        }

        //imutable list
        List<String> once = Collections.singletonList("Test");
        List<String> empty = Collections.emptyList();
        //tidak dapat merubah data
        List<String> imutable = Collections.unmodifiableList(arrayList);

        List<String> elements = List.of("Ichwan","Sholihin");
        //ERROR
        //elements.add("Testing");
    }
}
