package generic;

public class WildcardAApp {

    public static void main(String[] args) {
        cetak(new CovariantApp.Test<>(100L));
        cetak(new CovariantApp.Test<>("Hallo"));
    }

    //tanda ? = wildcard. sama kayak object
    public static void cetak(CovariantApp.Test<?> test){
        System.out.println(test.getTest());
    }
}
