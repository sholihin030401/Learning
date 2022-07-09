public class LearnMethod {

    public static void main(String[] args) {
        var total = calculate(100,"salah",3);
        System.out.println(total);

        graduate("Ichwan",90,80,60,40);

        System.out.println(factorialRecursive(5));
    }

    static int calculate(int val1, String operate, int val2){
        switch (operate){
            case "+":
                return val1+val2;
            case "-":
                return val1-val2;
            case "*":
                return val1*val2;
            case "/":
                return val1/val2;
            default:
                return 0;
        }
    }

    static void graduate(String nama, int... nilai){
        var total = 0;
        for(var value: nilai){
            total += value;
        }

        var rata2 = total/nilai.length;

        if (rata2 >= 75){
            System.out.println("Selamat "+ nama + " anda lulus!");
        } else {
            System.out.println("Maaf "+ nama + " anda tidak lulus!");
        }
    }

    //method recursive
    static int factorialRecursive(int nilai){
        if (nilai == 1){
            return 1;
        } else {
            return nilai * factorialRecursive(nilai - 1);
        }
    }
}
