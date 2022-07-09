package task_alterra.section8;

public class MaxProduct {

    static int maxProduct(int money, int[] price){
        int i,j, count = 0;

        for (i = 0; i < price.length; i++) {
            for (j = i + 1;j < price.length; j++){
                if ((price[i] + price[j]) < money){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] price = {15000,10000,12000,5000,3000};
        int money = 30000;

        System.out.println(maxProduct(money,price));
    }
}
