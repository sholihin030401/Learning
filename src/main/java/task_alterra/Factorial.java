package task_alterra;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factor;

        System.out.print("Input = ");
        factor = scanner.nextInt();

        for (int i = 1; i <= factor;i++){
            if (factor % i == 0){
                System.out.println(i);
            }
        }
    }
}
