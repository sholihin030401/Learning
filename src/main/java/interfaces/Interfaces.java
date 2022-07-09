package interfaces;

public class Interfaces  {
    public static void main(String[] args) {
        var univ = new Univ();
        univ.jmlMhs();
        univ.nama();
        univ.nim();
    }
}

interface Mahasiswa{
    void nama();
    void nim();
    //default method: gk perlu di override di kelas turunan
    default boolean cekMhs(){
        return true;
    }
}

interface Dosen extends Mahasiswa{
    int jmlMhs();
}

class Univ implements Mahasiswa, Dosen {
    public void nama() {
        System.out.println("Ichwan");
    }

    public void nim() {
        System.out.println("19312131");
    }

    public int jmlMhs() {
        return 40;
    }
}