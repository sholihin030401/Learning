package solving_paradigm;

public class BinarySearchApp {

    static int binarySearch(int arr[], int beg, int end, int x){
        if(beg > end)
            return -1;
        int mid = (beg + end)/2;
        if(arr[mid] == x)
            return mid;
        else if(arr[mid] > x)
            return binarySearch(arr, beg, mid-1, x);
        else
            return binarySearch(arr, mid+1, end, x);
    }

    public static void main(String[] args) {
        int arr[] = {1,1,3,5,5,6,7};
        int x = 3;
        int n = arr.length;
        int result = binarySearch(arr, 0, n-1, x);
        System.out.println(result);
    }
}
