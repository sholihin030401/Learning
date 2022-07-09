public class Basic {
    //static class tidak bisa mengakses object dari outer class
    public static void main(String[] args) {

        AnonymousApp anonim = nama -> System.out.println("my name is"+nama);

        anonim.anonym("Icwan");

        Kendaraan kendaraan = new Kendaraan("Toyota");
        System.out.println(kendaraan.nama);

        kendaraan.setNama("Mitsubishi");

        System.out.println(Runtime.getRuntime().availableProcessors());

        if (!kendaraan.nama.equals("Mitsubishi")){
            System.out.println("Berhasil");
        }

        String[] names = {"Ujang","Ahmad","Abdul","Rozak","Zaki"};

        for (var nama:
             names) {
            System.out.println(nama);
        }
    }
}
