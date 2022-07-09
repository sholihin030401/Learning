package polymorphism;

public class Officer extends Manager{
    String company;

    Officer(String name, String company) {
        super(name);
        this.company = company;
    }

    public void sayhello(String name) {
        System.out.println("hello officer "+name+", my name is"+this.name+" from "+this.company);
    }
}
