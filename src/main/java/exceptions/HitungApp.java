package exceptions;

public class HitungApp {
    public static void main(String[] args) {
        Hitung hitung = new Hitung(12,0);

//        try {
//            HitungUtil.validasiHitung(hitung);
//            System.out.println("Data Valid");
//        } catch (HitungException e) {
//            System.out.println("Exception on = "+e.getMessage());
//        } finally {
//            System.out.println("Finally");
//        }
//
//        Hitung hitung2 = new Hitung(0,1);
//        HitungUtil.validasiHitungRuntime(hitung2);

        try {
            int[] ganjil = {1,3,5,7,9};
            System.out.println(ganjil[10]);
        } catch (Throwable throwable) {
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();

            throwable.printStackTrace();
        }
    }
}
