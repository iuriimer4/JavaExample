package javaexample;

public class ConvertEurToUsd {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(10, 1));
    }

    public static double convertEurToUsd(int eur, double course) {

        return (eur * course);
    }
}
