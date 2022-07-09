package polymorphism;

public class Manager extends Employee{

    Manager(String name) {
        super(name);
    }

    public void sayhello(String name){
        System.out.println("hello manager "+name+", my name is "+this.name);
    }
}
