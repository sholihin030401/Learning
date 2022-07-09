package task_alterra.section11.inherit;

public class Main {
    public static void main(String[] args) {

        //inheritance task 1
        Vechile vechile = new Vechile("Gerobak","no engine");
        vechile.identify_myself("Parent of All Vechile");

        vechile = new Bike("Pedal","no engine","2 Wheel(s)");
        vechile.identify_myself("Bike");
        vechile = new Bike("Motor","with engine","2 Wheel(s)");
        vechile.identify_myself("Bike");

        vechile = new Cars("Sport","with engine","4 Wheel(s)","V8");
        vechile.identify_myself("Car");
        vechile = new Cars("Pickup","with engine","4 Wheel(s)","Solar");
        vechile.identify_myself("Car");

        vechile = new Buses("Trans Jakarta","with engine","Public Bus","4 Wheel(s)");
        vechile.identify_myself("Bus");
        vechile = new Buses("Trans Jakarta","with engine","Private engine","4 Wheel(s)");
        vechile.identify_myself("Bus");

        //inheritance task 2
        Animal animal = new Animal("Binatang",null,null);
        animal.identify_myself("Parent of All Animal");

        animal = new Herbivor("Kambing","tumbuhan","tumpul");
        animal.identify_myself("Herbivor");

        animal = new Carnivor("Singa","daging","tajam");
        animal.identify_myself("Carnivor");

        animal = new Omnivor("Ayam","semua","tumpul");
        animal.identify_myself("Omnivor");
    }
}
