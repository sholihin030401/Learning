package collections.sortedset;

import java.util.Comparator;

public class StudentComp implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        //ascending
        //return o1.getName().compareTo(o2.getName());

        //descending
        return o2.getName().compareTo(o1.getName());
    }
}
