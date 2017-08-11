package javaexample;

public class TypeCasting {
static byte x ;
static int a = 270;
static double b = 128.128;

    public static void main(String[] args) {
        System.out.println("int converted to byte");
        x = (byte) a;
        System.out.println(" a and x " + a + " " +x);
        System.out.println("------------------------");
        System.out.println("double converted to int");
        a = (int) b;
        System.out.println(" b and a " + b + " " + a);
        System.out.println("------------------------");
        System.out.println("double converted to byte");
        x = (byte)b;
        System.out.println(" b and x " + b + " " +x);
    }
}
