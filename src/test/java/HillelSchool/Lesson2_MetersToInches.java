package HillelSchool;

import java.util.Scanner;

public class Lesson2_MetersToInches {

  public static void main(String[] args) {
    //Meters to inches
    Scanner input = new Scanner(System.in);
    System.out.print("Input Value for meters: ");
    double meters = input.nextDouble();
    double inches = meters * 39.37;
    System.out.println(meters + " meter is " + inches + " inches\n");
        /*Inches to meters
        *
        * */
    System.out.print("Input values for inches: ");
    double inch = input.nextDouble();
    double meter = inch * 0.0254;
    System.out.println(inch + " inch is " + meter + " meter");


  }
}
