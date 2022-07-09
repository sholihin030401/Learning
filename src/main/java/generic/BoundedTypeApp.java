package generic;

public class BoundedTypeApp {
    public static void main(String[] args) {

        //hanya dapat mengakses class turunan dari generic class nya
        numData<Long> longnumData = new numData<>(1000L);
    }

    //multiple generic parameter type : yg kedua wajib interface, bukan class (karena dijava hanya boleh ada 1 class parent)
    public static class numData<T extends Number>{
        private T data;

        public numData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
