package time_complexity;

public class PrimeOn {

    static boolean primeNumber(int number){

        boolean checkComposite = number % 5 != 0 && number % 3 != 0;
        boolean checkPrime = number >= 2 && number % 2 != 0;

        if (checkPrime && checkComposite || number == 2 || number == 3 || number == 5){
            return true;
        }

        return false;
    }

    static boolean recursivePrime(int number){
        if (number < 2){
            return false;
        }

        int sqrtNumber = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrtNumber; i++) {
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(primeNumber(1000000007));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));

        System.out.println(recursivePrime(9));
    }
}
