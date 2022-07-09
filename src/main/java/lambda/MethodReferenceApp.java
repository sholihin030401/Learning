package lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {

    public static void main(String[] args) {
        Predicate<String> upperCase = MethodReferenceApp::isUpperCase;

        Function<String, String> funLower = String::toLowerCase;
        System.out.println(funLower.apply("ICHWAN"));

        System.out.println(upperCase.test("ICHWAN"));
        System.out.println(upperCase.test("ichwan"));

    }

    //method reference static
    public static boolean isUpperCase(String value){
        for (var character: value.toCharArray()){
            if (Character.isUpperCase(character)){
                return true;
            }
        }
        return false;
    }
}
