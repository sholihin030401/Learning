package enumclass;

public class EnumApp {
    public static void main(String[] args) {
        Validate validate = Validate.ADMIN;
        System.out.println(validate);
        System.out.println(validate.getDescription());
    }
}
