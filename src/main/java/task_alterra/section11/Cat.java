package task_alterra.section11;

public class Cat {

    private String fur_color;
    private int num_of_leg;

    public String getFur_color() {
        return fur_color;
    }

    public void setFur_color(String fur_color) {
        this.fur_color = fur_color;
    }

    public int getNum_of_leg() {
        return num_of_leg;
    }

    public void setNum_of_leg(int num_of_leg) {
        this.num_of_leg = num_of_leg;
    }

    public static void show_identity(){
        Cat cat = new Cat();
        String[] color = {"Hitam","Putih","Hitam Putih","Poleng poleng","bintik bintik"};
        int[] foot = {4,3,4,3,4};

        for (int i = 0; i < color.length; i++) {
            cat.setFur_color(color[i]);
            cat.setNum_of_leg(foot[i]);
            System.out.println("Saya Kucing dengan detail, Warna Bulu: "+cat.getFur_color()+" dengan jumlah kaki : "+cat.getNum_of_leg());
        }
    }

    public static void main(String[] args) {
        show_identity();
    }
}
