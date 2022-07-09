package compfest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.Math.*;

public class PreparingOlympiad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringTokenizer token;
        token = new StringTokenizer(input.nextLine());

        int n = parseInt(token.nextToken());
        int l = parseInt(token.nextToken());
        int r = parseInt(token.nextToken());
        int x = parseInt(token.nextToken());

        int[] c = new int[n];
        token = new StringTokenizer(input.nextLine());
        for (int i = 0; i < n; i++) {
            c[i] = parseInt(token.nextToken());
        }

        int result = 0;

        for (int m = 0; m < (1<<n); m++){

            int mins = Integer.MAX_VALUE;
            int maxs = Integer.MIN_VALUE;
            int cnt = 0;
            int sum = 0;

            for (int i = 0; i < n; i++) {
                if ((m & (1<<i)) != 0){
                    cnt++;
                    sum += c[i];
                    mins = min(mins, c[i]);
                    maxs = max(maxs, c[i]);
                }
            }

            if (maxs-mins >= x && sum>=l && sum<= r && cnt>=2) result++;
        }

        System.out.println(result);
    }
}
