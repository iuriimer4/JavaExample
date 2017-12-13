package HillelSchool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson2_FarehheitToCelsius {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter temperature in Farenheit: ");
        double farenheit= Double.parseDouble(reader.readLine());
        double celsius = (5.0/9.0) * (farenheit - 32);
        System.out.println("Temperature in Celsius Is : " + celsius);


    }
}
