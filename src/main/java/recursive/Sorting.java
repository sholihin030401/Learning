package recursive;

import java.util.Arrays;

public class Sorting {

    static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minimal = i;
            for (int j = i + 1;j < n;j++){
                if (arr[j] < arr[minimal]){
                    minimal = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimal];
            arr[minimal] = temp;
        }

        return arr;
    }
    
    static int[] countingSort(int[] arr, int k) {
        int[] count = new int[k + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int counter = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < count[i]; j++){
                arr[counter] = i;
                counter++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        System.out.println(Arrays.toString(selectionSort(arr)));
        System.out.println(Arrays.toString(countingSort(arr, 6)));
    }
}
