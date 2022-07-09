package solving_paradigm;

import java.util.HashMap;
import java.util.Map;

public class DragonApp {

    static void dragon(int[] dragon, int[] knight, int n, int m){
        int gold = 0, d = 0, k = 0;

        while (d < n && k < m){
            while (dragon[d] > knight[k] && k < m) k++;
            if (k == n)
                break;
            gold+=knight[k];
            d++;
            k++;
        }

        if (d == n){
            System.out.println(gold);
        } else{
            System.out.println("knight fall");
        }
    }

    public static void main(String[] args) {
        int[] a = {5,4};
        int[] b = {7,8,4};

        dragon(a,b,2,5);

    }
}
