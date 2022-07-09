package task_alterra;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Perpangkatan {

    static int pangkat(int x, int n){
        return (int) pow(x, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai x: ");
        int x = sc.nextInt();

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println(pangkat(x, n));
    }
}
