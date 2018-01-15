package HillelSchool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson2_CelsiusToKelvin {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please Enter Temperature in Celsius: ");
    double celsius = Double.parseDouble(reader.readLine());
    double kelvin = celsius + 273.16;
    System.out.println("Temperature in Kelvin is: " + kelvin);

  }
}
