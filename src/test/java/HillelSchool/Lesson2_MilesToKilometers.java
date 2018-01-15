package HillelSchool;

import java.util.Scanner;

public class Lesson2_MilesToKilometers {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter value for miles: ");
    double miles = input.nextDouble();
    double kilometers = miles * 1.609;
    System.out.println(miles + " miles is: " + kilometers + " kilometers\n");

    //Kilometers to miles
    System.out.print("Enter value for kilometer: ");
    double kilometer = input.nextDouble();
    double mile = 0.621 * kilometer;
    System.out.println(kilometer + " kilometers is: " + mile + " miles");
  }
}
