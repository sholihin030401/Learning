package exceptions;

//bisa juga extends ke Error untuk error yang fatal
public class Runtimes extends RuntimeException {
    public Runtimes(String message) {
        super(message);
    }
}
