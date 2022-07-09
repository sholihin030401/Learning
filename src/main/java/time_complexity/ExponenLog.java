package time_complexity;

public class ExponenLog {
    public static Integer pow(Integer x, Integer n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        int half = pow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2,3));
        System.out.println(pow(5,3));
        System.out.println(pow(10,2));
        System.out.println(pow(2,5));
        System.out.println(pow(7,3));
    }
}
