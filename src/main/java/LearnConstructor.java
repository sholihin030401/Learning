public class LearnConstructor {

    String nama;
    int umur;

    public static void main(String[] args) {
        var cons = new LearnConstructor("Ichwan",19);
        var cons2 = new LearnConstructor(19);

        System.out.println(cons.nama + cons.umur);
        System.out.println(cons2.nama + cons.umur);
    }

    LearnConstructor(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    LearnConstructor(int umur){
        this(null,19);
    }
}

