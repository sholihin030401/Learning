package task_alterra;

import java.util.Scanner;

public class Arterisk {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i,N;

        System.out.print("input : ");
        N = input.nextInt();

        for (i = 1; i <= N; i++){
            var space = " ".repeat(N-i);
            var star = " *".repeat(i);

            System.out.println(space + star);
        }
    }
}
