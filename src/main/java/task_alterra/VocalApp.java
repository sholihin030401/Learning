package task_alterra;

import java.util.Scanner;

public class VocalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        int vokal = 0, konsonan = 0;

        System.out.print("Input : ");
        text = scanner.nextLine();

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++){
            char karakter = text.charAt(i);

            if (karakter == 'a' || karakter == 'i' || karakter == 'u' || karakter == 'e' || karakter == 'o'){
                vokal++;
            } else if (karakter >= 'a' && karakter <= 'z'){
                konsonan++;
            }
        }

        System.out.println("Jumlah vokal = "+vokal);
        System.out.println("Jumlah konsonan = "+konsonan);
        System.out.println("Jumlah karakter = "+text.replace(" ","").length());
    }
}
