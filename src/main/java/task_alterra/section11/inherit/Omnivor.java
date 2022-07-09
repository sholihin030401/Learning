package task_alterra.section11.inherit;

public class Omnivor extends Animal{

    public Omnivor(String nama, String makanan, String gigi) {
        super(nama, makanan, gigi);
    }

    public void identify_myself(String nama){
        System.out.println("Hi I'm "+nama+", My Name is "+this.nama+", My Food is '"+this.makanan+"', I have "+this.gigi+" teeth");
    }
}
