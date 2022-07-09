package standardclasses;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,4,5,6,7,88,9,5,69,12,34,6,76,7};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        //print value itu indexnya keberapa
        System.out.println(Arrays.binarySearch(numbers,3));

        int[] result = Arrays.copyOfRange(numbers,2,8);
        System.out.println(Arrays.toString(result));
    }
}
