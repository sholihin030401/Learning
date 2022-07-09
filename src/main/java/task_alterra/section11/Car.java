package task_alterra.section11;

public class Car {
    private String type;
    private String color;
    private int num_of_tire;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum_of_tire() {
        return num_of_tire;
    }

    public void setNum_of_tire(int num_of_tire) {
        this.num_of_tire = num_of_tire;
    }

    private static void show_identity(){
        Car car = new Car();

        String[] tipe = {"sedan","truk","tronton","angkot"};
        String[] warna = {"merah","hijau","coklat","kuning"};
        int[] ban = {4,6,12,4};

        for (int i = 0; i < tipe.length; i++) {
            car.setType(tipe[i]);
            car.setColor(warna[i]);
            car.setNum_of_tire(ban[i]);

            System.out.println("saya mobil dengan detail, Type: "+car.getType()+", color: "+car.getColor()+", num of tire: "+car.getNum_of_tire());
        }
    }

    public static void main(String[] args) {
        show_identity();
    }
}
