package task_alterra.section11.inherit;

public class Bike extends Vechile{

    String wheel_count;

    public Bike(String name, String with_engine, String wheel_count) {
        super(name, with_engine);
        this.wheel_count = wheel_count;
    }

    public void identify_myself(String name){
        System.out.println("Hi I'm "+name+", My Name is "+this.name+" Bikes, My Engine Status is '"+this.with_engine+"', I have "+this.wheel_count);
    }
}
