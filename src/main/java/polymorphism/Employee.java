package polymorphism;

public class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }

    public void sayhello(String name){
        System.out.println("hello employee "+name+", my name is "+this.name);
    }

    //outputing the name of the employee
    @Override
    public String toString() {
        return "my name is "+this.name;
    }

    //inner class
    public class Manager{
        String name;

        //akses method sayhello dari Employee
        public void getHello(){
            Employee.this.sayhello(this.name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
