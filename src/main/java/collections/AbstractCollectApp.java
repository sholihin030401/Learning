package collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

//ketimbang implementasi interface collection nya mending extends class abstractnya
public class AbstractCollectApp<E> extends AbstractList<E> {

    private E data;

    @Override
    public boolean add(E e) {
        if (data == null){
            data = e;
            return true;
        }
        return false;
    }

    @Override
    public E get(int index) {
        return data;
    }

    @Override
    public int size() {
        return data == null? 0 : 1;
    }
}

class AbstractListApp{
    public static void main(String[] args) {
        List<String> name = new AbstractCollectApp<>();

        name.add("Ichwan");
        name.add("Sholihin");
        name.add("Lampung");
        System.out.println(name.get(1));
        System.out.println(name.size());
    }
}
