package compfest;

import java.util.Scanner;

public class TableTennis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, state;
        long k;
        int[] a = new int[500];

        n = input.nextInt();
        k = input.nextLong();

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int res = a[0];
        state=0;
        for (int i = 1; i < n; i++) {
            if (state>=k){
                System.out.println(res);
                System.exit(0);
            }

            if (res > a[i]){
                state++;
            } else {
                state = 1;
                res = a[i];
            }
        }
        System.out.println(res);
        System.exit(0);
    }
}
