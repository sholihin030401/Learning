package exceptions;

public class HitungUtil {

    //checked exception
    public static void validasiHitung(Hitung hitung) throws HitungException {
        if (hitung.getNumA() == 0) {
            throw new HitungException("Nilai A tidak boleh 0");
        } else if (hitung.getNumB() == 0) {
            throw new HitungException("Nilai B tidak boleh 0");
        }
    }

    //runtime exception
    public static void validasiHitungRuntime(Hitung hitung) {
        if (hitung.getNumA() == 0) {
            throw new Runtimes("Nilai A tidak boleh 0");
        } else if (hitung.getNumB() == 0) {
            throw new Runtimes("Nilai B tidak boleh 0");
        }
    }
}
