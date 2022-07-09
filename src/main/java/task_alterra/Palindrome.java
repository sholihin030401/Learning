package task_alterra;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        StringBuilder value = new StringBuilder();

        System.out.print("input = ");
        word = input.nextLine();

        for (int i = word.length()-1; i >= 0; i--) {
            value.append(word.charAt(i));
        }

        if (word.equals(value.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Bukan Palindrome");
        }
    }
}
