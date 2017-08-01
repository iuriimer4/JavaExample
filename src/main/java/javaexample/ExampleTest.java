package javaexample;

public class ExampleTest  {
    int a = 10;
    public int b  = 11;
    protected int c = 12;
    private int d = 13;
    public int o = 15;


    void method1() {
        System.out.println("ExampleTest.method1" );
    }

    public void method2(){
        System.out.println("ExampleTest.method2" );
    }
    protected void method3(){
        System.out.println("ExampleTest.method3" );
    }

    private void method4() {
        System.out.println("ExampleTest.method4" );
    }

    public static void main(String[] args) {
        ExampleTest obj = new ExampleTest();

        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }

}
