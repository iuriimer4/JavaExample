package javaexample;

import java.util.Formatter;

public class Formatters {

    public static void main(String[] args) {
        try {
            Formatter f  = new Formatter("C:\\users\\iurri.merviak\\test.txt");
        }catch (Exception e) {
            System.out.println("Error");
        }
    }

}
