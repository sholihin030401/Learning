package recursive;

public class Recursive {
    //faktor persekutuan terbesar
    static int gcp(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcp(b, a % b);
    }

    //kelipatan persekutuan terkecil
    static int lcm(int a, int b){
        return a * (b / gcp(a, b));
    }

    public static void main(String[] args) {

        System.out.println(gcp(30, 12));
        System.out.println(lcm(30, 12));
    }
}
