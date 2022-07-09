package task_alterra.section11.inherit;

public class Vechile {
    String name;
    String with_engine;

    public Vechile(String name, String with_engine) {
        this.name = name;
        this.with_engine = with_engine;
    }

    public void identify_myself(String name){
        System.out.println("Hi I'm "+name+", My Name is "+this.name+", My Engine Status is '"+this.with_engine+"'");
    }
}
