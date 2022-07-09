package lambda;

public class LambdaApp {
    public static void main(String[] args) {

        //versi tersimple lambda
        //nama parameter gk harus sama, karena java udh tau dari interfacenya
        LambdaInterface lambdaInterface = nomor -> 3*5*nomor;

        System.out.println(lambdaInterface.action(12));
    }
}
