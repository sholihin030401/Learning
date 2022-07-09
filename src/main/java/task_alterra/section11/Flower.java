package task_alterra.section11;

public class Flower {

    private String nama;
    private String color;
    private int num_of_petal;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum_of_petal() {
        return num_of_petal;
    }

    public void setNum_of_petal(int num_of_petal) {
        this.num_of_petal = num_of_petal;
    }

    private static void show_identity(){
        Flower flower = new Flower();

        String[] name = {"bangkai","anggrek","mawar","melati"};
        String[] colors = {"merah","putih","merah","kuning"};
        int[] number = {12,8,3,5};

        for (int i = 0; i < name.length; i++) {
            flower.setNama(name[i]);
            flower.setColor(colors[i]);
            flower.setNum_of_petal(number[i]);

            System.out.println("saya bunga dengan detail, jenis: "+flower.getNama()+", color: "+flower.getColor()+", num of petal: "+flower.getNum_of_petal());
        }
    }

    public static void main(String[] args) {
        show_identity();
    }
}
