package lambda;

import java.util.Optional;

//optional class digunakan untuk menghindari error NPE
public class OptionalApp {

    public static void main(String[] args) {
        sayHello("ichwan");
        sayHello(null);
    }

    public static void sayHello(String name){
        Optional.ofNullable(name)
                .map(String::toLowerCase)
                .ifPresent(value -> System.out.println("hai " +value));
    }
}
