package generic;

//hanya boleh ambil data tapi gk boleh ngubah data
public class CovariantApp {
    public static void main(String[] args) {
        Test<Integer> testInt = new Test<>(100);
        process(testInt);
    }

    public static void process(Test<? extends Object> mytest){
        System.out.println(mytest.getTest());

        //mytest.setTest("test"); ERROR
    }

    public static class Test<T>{
        private T test;

        public Test(T test) {
            this.test = test;
        }

        public T getTest() {
            return test;
        }

        public void setTest(T test) {
            this.test = test;
        }
    }
}


