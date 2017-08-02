package javaexample;

public class Example extends ExampleTest {
    int a = 10;
    public int b  = 11;
    protected int c = 12;
    private int d = 13;


    void method1() {
        System.out.println("Example.method1");
    }

    public void method2() {
        System.out.println("Example.method2");
    }
    protected void method3() {
        System.out.println("Example.method3");
    }
    private void method4() {
        System.out.println("ExampleTest.method4");
    }

   public static void main(String[] args) {
       Example obj = new Example();
       System.out.println(obj.d);

       ExampleTest obj1 = new ExampleTest();
       int o = obj1.o;
       int a = obj1.a;





   }
}
