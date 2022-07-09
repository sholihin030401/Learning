package task_alterra.section8;

import java.util.*;

public class AppearItem {
    public static void main(String[] args) {
       String[] text = {"js","js","ruby","ruby","golang","js","js"};

        List list = Arrays.asList(text);
        Set<String> set = new HashSet<String>(list);

        for (String s: set){
            System.out.println(s+"->"+ Collections.frequency(list,s));
        }
    }
}
