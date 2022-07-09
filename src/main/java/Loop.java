
public class Loop {

    public static int funs(int[] x,int a, int b, int i, int j) {
        int k = j;
        int ct = 0;
        while (k > i-1){
            if (x[k] <= b && !(x[k] <= a)){
                ct = ct+1;
            }
            k = k - 1;
        }
        return ct;
    }

    public static void main(String[] args) {

        int arrays[] = {11,10,10,5,10,15,20,10,7,11};
        //System.out.println(funs(arrays,8,18,3,6));
        //System.out.println(funs(arrays,10,20,0,9));
        //System.out.println(funs(arrays,8,18,6,3));
        //System.out.println(funs(arrays,20,10,0,9));
        System.out.println(funs(arrays,6,7,8,8));
    }
}
