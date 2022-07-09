package abstracts;

//abstract class hanya bisa di turunkan, tidak bisa dijadikan object
//sama kayak interface, tapi kalo mau diextends pake kata kunci implements (direkomendasikan menggunakan interface)
public abstract class AbstractClass {

    public String name;
    public abstract void sayHi();

    public void sayHello(){
        System.out.println("Hello, my name is "+name);
    }
}

class TestMain extends AbstractClass{
    @Override
    public void sayHi() {
        System.out.println("Hi, "+name);
    }
}

class Main{
    public static void main(String[] args) {
        //polymorphism
        AbstractClass test = new TestMain();
        test.name = "Ichwan";
        test.sayHello();
        test.sayHi();
    }
}
