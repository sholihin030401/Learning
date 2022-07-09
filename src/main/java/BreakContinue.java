public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++){

            var nilai = i % 2 == 0 ? "perulangan"+i : "ganjil";

            System.out.println(nilai);
        }

        int a = 6;
        int i = 0;

        while(a > 3){
            i++;
        }

        System.out.println(i);
    }
}
