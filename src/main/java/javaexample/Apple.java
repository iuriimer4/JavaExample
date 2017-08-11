package javaexample;

public class Apple extends TreeClass {

    void fall() {
    }

    public static void main(String[] args) {
        TreeClass a = new Apple();
        Apple b = (Apple) a;
        Apple c = (Apple) b;
        Apple d = (Apple) c;
        a.grow();

        b.fall();
        b.grow();

        c.fall();
        c.grow();

        d.grow();
        d.fall();
    }
}


