package time_complexity;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class PairSum {

    static boolean checkPair(int arrays[], int size, int x){
        for (int i = 0; i < (size-1); i++) {
            for (int j = (i + 1);j < size; j++){
                if (arrays[i] + arrays[j] == x){
                    System.out.println(arrays[i]+arrays[j]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arrays[] = {1,2,3,4,6};
        int target = 6;
        int size = arrays.length;

        checkPair(arrays,size,target);

    }
}
