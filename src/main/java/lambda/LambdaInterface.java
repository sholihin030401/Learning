package lambda;

//buat lambda interface wajib ada annotation ini
@FunctionalInterface
public interface LambdaInterface {

    //lambda wajib memiliki 1 function, tidak boleh lebih
    Integer action(Integer number);
}
