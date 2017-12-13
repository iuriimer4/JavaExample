package HillelSchool;

import org.apache.xpath.SourceTree;

import java.util.Scanner;

public class Lesson2_MilesToKilometers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for miles: ");
        double miles = input.nextDouble();
        double kilometers = miles * 1.609;
        System.out.println(miles +  "miles is: " + kilometers + " kilometers\n" );

        //Kilometers to miles
        System.out.println("Enter value for kilometer: ");
        double kilometer = input.nextDouble();
        double mile = kilometers * 0.621371;
        System.out.println(kilometer + " kilometers is: " + miles + " miles");
    }
}
