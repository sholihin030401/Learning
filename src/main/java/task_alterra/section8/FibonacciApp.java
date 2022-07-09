package task_alterra.section8;

public class FibonacciApp {
//    static int fib(int n){
//        if (n == 0){
//            return 0;
//        } else if (n == 1){
//            return 1;
//        }
//        return (fib(n-1) + fib(n-2));
//    }

    static int fibonacci(int n){
        int[] fib = new int[n+1];
        int i;

        fib[0] = 0;
        fib[1] = 1;

        for (i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        return fib[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
    }
}
