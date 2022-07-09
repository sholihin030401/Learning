package standardclasses;

import java.util.Objects;

public class ObjectsApp {

    public static void main(String[] args) {
        execute(null);
    }

    public static void execute(String name){

//        if(name != null){
//            System.out.println(name.hashCode());
//        }

        //dengan objects class kita tidak perlu menggunakan pengecekan null
        System.out.println(Objects.hashCode(name));
    }
}
