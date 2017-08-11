package javaexample;

public class Loader implements Runnable {
    public void run() {
        System.out.println("Hello");
    }
}
class MyClass {
    public static void main(String[] args) {
        Loader b = new Loader();
        Thread t = new Thread(b);
        t.start();
    }
}
