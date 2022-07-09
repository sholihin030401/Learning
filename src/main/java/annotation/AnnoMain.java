package annotation;

@AnnoApp(name = "AnnoApp", age = 10, hobby = {"coding", "reading"})
public class AnnoMain {

    @AnnoApp(name = "Alex", age = 11, hobby = {"cooking", "swiming"})
    public static void main(String[] args) {
        System.out.println("AnnoApp");
    }
}
