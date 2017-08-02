package javaexample;

public class StaticNonStatic {
    int a = 10;
    int b = 15;
    static int c = 5;
    static int d = 3;

    void first(){}
    void second(){}
    static void third() {}
    static void fourth() {}

    public static void  main (String[] args) {
        StaticNonStatic obj = new StaticNonStatic();

        obj.first();
        obj.second();
        StaticNonStatic.third();
        StaticNonStatic.fourth();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(StaticNonStatic.c);
        System.out.println(StaticNonStatic.d);

    }
}
