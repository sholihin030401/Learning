package task_alterra.section11.inherit;

public class Buses extends Vechile{

    String wheel_count;
    String private_bus;

    public Buses(String name, String with_engine, String private_bus, String wheel_count) {
        super(name, with_engine);
        this.wheel_count = wheel_count;
        this.private_bus = private_bus;
    }

    public void identify_myself(String name){
        System.out.println("Hi I'm "+name+" ["+this.private_bus+"] , My Name is "+this.name+", My Engine Status is '"+this.with_engine+"', I have "+this.wheel_count);
    }
}
