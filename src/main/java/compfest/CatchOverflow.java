package compfest;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CatchOverflow {
    public static void main(String[] args) {
        NextInput nextInput = new NextInput();

        long x = 0;
        int l = nextInput.nextInt();

        long pangkat = (long) (Math.pow(2,32)-1);
        LinkedList<Long> list = new LinkedList<>();
        list.add(1l);

        boolean bool = true;
        for (int i = 0; i < l; i++) {
            if (bool) {
                String st = nextInput.next();
                if (st.equals("for")){
                    long hasil = list.getLast() * nextInput.nextLong();
                    if (hasil > pangkat)
                        list.add(pangkat+1);
                    else
                        list.add(hasil);
                }
                else if (st.equals("end"))
                    list.removeLast();
                else {
                    x+=list.getLast();
                    if (x>pangkat)
                        bool = false;
                }
            }
            else nextInput.nextLine();
        }

        if (bool){
            System.out.println(x);
        }
        else {
            System.out.println("OVERFLOW!!!");
        }
    }
}

class NextInput{
    Scanner input = new Scanner(System.in);
    StringTokenizer token;

    String next(){
        while (token == null || !token.hasMoreElements()){
            token = new StringTokenizer(input.nextLine());
        }
        return token.nextToken();
    }

    String nextLine() {
        String str = "";
        str = input.nextLine();
        return str;
    }

    int nextInt() {return Integer.parseInt(next());}
    long nextLong() {return Long.parseLong(next());}

}