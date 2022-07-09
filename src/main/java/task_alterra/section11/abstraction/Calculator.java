package task_alterra.section11.abstraction;

import java.util.Scanner;

public class Calculator {

    public static int calculate(int valOps, int val1, int val2){

        if(valOps == 1){
            return val1 + val2;
        } else if (valOps == 2){
            return val1 - val2;
        } else if (valOps == 3){
            return val1 * val2;
        } else if (valOps == 4){
            return val1 / val2;
        }

        return 0;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Open Calculator");
        System.out.println("99: Exit");
        System.out.print("Masukan pilihan anda:");
        int menu = scanner.nextInt();

        if (menu == 1){
            System.out.print("Masukkan value 1: ");
            int value1 = scanner.nextInt();
            System.out.print("Masukkan value 2: ");
            int value2 = scanner.nextInt();

            System.out.println("Please enter calculation operation: ");
            System.out.println("1. Add Value\n2. Sub Value\n3. Multiply Value\n4. Divide Value");
            System.out.print("Pilihan anda: ");
            int choice = scanner.nextInt();

            System.out.println("Hasil "+ calculate(choice,value1,value2));
        }
    }
}
