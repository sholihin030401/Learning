package time_complexity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MergeApp {

    static String[] ArrayMerge(String[] arrayA, String[] arrayB){
        HashSet<String> hashSet = new LinkedHashSet<>();

        hashSet.addAll(Arrays.asList(arrayA));
        hashSet.addAll(Arrays.asList(arrayB));

        String[] merge = {};
        merge = hashSet.toArray(merge);

        return merge;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArrayMerge(new String[]{"kazuya","jin","lee"}, new String[]{"kazuya","feng"})));
        System.out.println(Arrays.toString(ArrayMerge(new String[]{"lee","jin"}, new String[]{"kazuya","panda"})));
    }
}
