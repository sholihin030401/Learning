package task_alterra.section11.inherit;

public class Cars extends Vechile{

    String wheel_count;
    String engine_type;

    public Cars(String name, String with_engine, String wheel_count, String engine_type) {
        super(name, with_engine);
        this.wheel_count = wheel_count;
        this.engine_type = engine_type;
    }

    public void identify_myself(String name){
        System.out.println("Hi I'm "+name+", My Name is "+this.name+", My Engine Status is '"+this.with_engine+"', I have "+this.wheel_count+", My Engine Type = "+this.engine_type);
    }

}
