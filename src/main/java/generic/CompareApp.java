package generic;

import java.util.Arrays;

public class CompareApp {

    public static void main(String[] args) {
        ComparableApp[] comparableApps = {
                new ComparableApp("SI",20),
                new ComparableApp("IF",19),
                new ComparableApp("TK",18)
        };

        Arrays.sort(comparableApps);

        System.out.println(Arrays.toString(comparableApps));
    }
}
