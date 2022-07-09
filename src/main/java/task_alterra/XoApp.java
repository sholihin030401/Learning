package task_alterra;

import java.util.Scanner;

public class XoApp {
    public static void main(String[] args) {
        XoApp xoApp = new XoApp();
        System.out.println(xoApp.checkValue("xoxoxo"));

    }

    public boolean checkValue(String input){
        int letX = 0, letO = 0;

        for (int i = 0; i < input.length(); i++){
            char letters = input.charAt(i);

            if (letters == 'x'){
                letX++;
            } else if (letters == 'o'){
                letO++;
            }
        }

        if (letX == letO){
            return true;
        }
        return false;
    }
}
