package collections.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Student> students = new TreeSet<>(new StudentComp());

        students.add(new Student("Jaka"));
        students.add(new Student("Abdi"));
        students.add(new Student("Ujang"));

        for (var people: students){
            System.out.println(people.getName());
        }
    }
}
