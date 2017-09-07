package javaexample.otherpackage;

import javaexample.Example;
import javaexample.ExampleTest;


public class NewExample  extends ExampleTest {

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
        System.out.println("Example.method4");
    }

    public static void main(String[] args) {
      NewExample obj = new NewExample();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();


        int b = obj.b;
        int c = obj.c;
        int o = obj.o;




    }
}


