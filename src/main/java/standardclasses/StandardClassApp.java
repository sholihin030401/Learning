package standardclasses;

import java.util.UUID;

public class StandardClassApp {
    public static void main(String[] args) {
        System.out.println(System.nanoTime());
//        System.console();
//        //mengclose console
//        System.exit(3);
//
//        System.out.println("Test");

        //untuk mengetahui jumlah processor/core di device
        System.out.println(Runtime.getRuntime().availableProcessors());

        for (int i = 0; i < 10; i++) {
            //universal unique identifier (untuk primary key database)
            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();

            System.out.println(key);
        }
    }
}
