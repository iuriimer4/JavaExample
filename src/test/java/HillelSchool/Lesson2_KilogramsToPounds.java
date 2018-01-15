package HillelSchool;

import java.util.Scanner;

public class Lesson2_KilogramsToPounds {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the kilogram");
    double kilogram = input.nextDouble();
    double pound = kilogram * 2.2046;
    System.out.println(kilogram + " kilogram is: " + pound + " pound\n");

    //Pound  to kilogram
    System.out.print("Enter the pounds");
    double pounds = input.nextDouble();
    double kilograms = pounds * 0.454;
    System.out.println(pounds + " pounds is: " + kilograms + " kilograms");

  }
}
