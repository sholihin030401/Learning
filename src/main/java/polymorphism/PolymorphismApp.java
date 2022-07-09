package polymorphism;

public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Ichwan");
        employee.sayhello("Sholihin");

        employee = new Manager("Abdul");
        employee.sayhello("Ahmad");

        employee = new Officer("Ujang","Plasindo");
        employee.sayhello("Dani");

        sayHello(new Employee("Budi"));
        sayHello(new Manager("Christ"));
        sayHello(new Officer("Asep",null));

        System.out.println(employee);

        //akses inner class
        Employee.Manager manager = employee.new Manager();
        manager.setName("Budi");
        System.out.println(manager.getName());

    }

    static void sayHello(Employee employee){
        //type check and cast untuk konversi tipe data non-primitif
        if (employee instanceof Officer){
            Officer officer = (Officer) employee;
            System.out.println("Hello officer "+officer.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello manager "+manager.name);
        } else {
            System.out.println("Hello "+employee.name);
        }
    }
}
