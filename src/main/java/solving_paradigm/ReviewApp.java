package solving_paradigm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReviewApp {

    public static List<Integer> reverseArray(List<Integer> arr){

        int i=0,k,temp;
        int n = arr.size();
        int index = arr.indexOf(i);
        int indexOf = arr.indexOf(n-i-1);

        for (i = 0;i  < n/2; i++) {
            temp = index;
            index = indexOf;
            indexOf = temp;
        }

        return arr;
    }

    public static void main(String[] args) {

        List<Integer> arrays = new ArrayList<>(List.of(1,2,3,4,5));

        System.out.println(reverseArray(arrays));
    }
}
