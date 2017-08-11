package javaexample;

public class ArrayByReference {

    public static void passByReference(String a[]) {
        a[0] = "Changed";
    }

    public static void main(String[] args) {
       String[]b = {"Apple", "Mango", "Orange"};
        System.out.println("Before function call "+b[0]);
        ArrayByReference.passByReference(b);
        System.out.println("After function call  "+b[0]);
    }

}
