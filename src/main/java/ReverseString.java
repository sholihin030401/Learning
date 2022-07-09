public class ReverseString {

    public static String gengs(String gStr){
        int i = 0;
        String new_str = "";
        while (i < gStr.length() - 1){
            new_str = new_str + (i + 1);
            i++;
        }
        return new_str;
    }

    public static String funs(String fStr){
        if (fStr.length() == 0){
            return "";
        } else if(fStr.length() == 1){
            return fStr;
        } else {
            return funs(gengs(fStr)) + 0;
        }
    }

    public static String heys(int n, String hStr){
        while (n != 1){
            if (n%2 == 0){
                n = n/2;
            } else {
                n = 3*n + 1;
            }

            hStr = funs(hStr);
        }

        return hStr;
    }

    public static int pow(int x, int y){
        if (y == 0){
            return 1;
        } else {
            return x * pow(x,y-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(heys(pow(2,10),"fruits"));
    }
}
