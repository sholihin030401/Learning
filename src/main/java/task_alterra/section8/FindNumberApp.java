package task_alterra.section8;

public class FindNumberApp {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, -2, -1, 8};
        findNumber(arr);
    }

    static void findNumber(int[] array){
        int min = 0, max = 0, iMin = 0, iMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
                iMin = i;
            } else {
                max = array[i];
                iMax = i;
            }
        }

        System.out.println("min "+min+" index "+iMin);
        System.out.println("max "+max+" index "+iMax);
    }
}
