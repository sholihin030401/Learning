package generic;

public class GenericApp {

    public static void main(String[] args) {

        //tanpa melakukan konversi tipe data = erronya ketika compile (lebih aman)
        Data<Integer> dataInt = new Data<>();
        dataInt.setData(12);
        System.out.println(dataInt.getData());

        //kalo double ditambah aja parameter type nya, tinggal cast Data<T,U>
        Data<String> dataString = new Data<>();
        dataString.setData("Ichwan");
        System.out.println(dataString.getData());

        //melakukan konversi = errornya ketika runtime
        DataNonGeneric nonGeneric = new DataNonGeneric();
        nonGeneric.setDataN("Sholihin");
        String value = (String) nonGeneric.getDataN();
        System.out.println(value);

        //panggil generic method
        Integer[] num = {1,2,3,4,5,6,7,0};
        System.out.println(count(num));

    }

    // data generic menggunakan parameter type
    public static class Data<T>{
        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    //tanpa menggunakan parameter type
    public static class DataNonGeneric{

        private Object data;

        public Object getDataN() {
            return data;
        }

        public void setDataN(Object data) {
            this.data = data;
        }
    }

    //parameter type di method
    static <T> int count(T[] array){
        return array.length;
    }
}

