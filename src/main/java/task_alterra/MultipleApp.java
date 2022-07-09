package task_alterra;

import java.util.Scanner;

public class MultipleApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.println("input : ");
        int n = input.nextInt();

        for (a = 1; a <= n; a++){
            for (b = 1; b <= n; b++){
                System.out.print(a*b+" ");
            }
            System.out.println();
        }
    }
}
