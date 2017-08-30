package javaexample;

public class PrintString {
    public static void main(String[] args) {
        writeToConsole("Hello world!");
    }

    public static void writeToConsole(String s) {
        String a = "printing: ";
        System.out.print(a );
        System.out.println(s);
    }
}

