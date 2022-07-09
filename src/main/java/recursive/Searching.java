package recursive;

import java.util.Arrays;

public class Searching {

    static int linearSearch(int[] elements, int x){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == x){
                return i;
            }
        }

        return -1;
    }

    //length(elements)-1 => default
    static int binarySearch(int[] elements, int x){
        return Arrays.binarySearch(elements, x);
    }

    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5};
        int x = 1;
        int index = linearSearch(elements, x);
        System.out.println("Linear search: " + index);
        System.out.println("Binary search: " + binarySearch(elements, x));
    }
}
