package task_alterra.section11.inherit;

public class Animal {
    String nama;
    String makanan;
    String gigi;

    public Animal(String nama, String makanan, String gigi) {
        this.nama = nama;
        this.makanan = makanan;
        this.gigi = gigi;
    }

    public void identify_myself(String nama){
        System.out.println("Hi I'm "+nama+", My Name is "+this.nama);
    }
}
