package strings;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb);
        sb.delete(6, 11);
        System.out.println(sb);
        sb.insert(6, "Java");
        System.out.println(sb);
        sb.replace(6, 11, "Java");
        System.out.println(sb);

        var name = "Ichwan";
        char[] chars = name.toCharArray();
        System.out.println(chars[2]);
    }
}
