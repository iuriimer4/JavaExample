package HillelSchool;

import java.util.Scanner;

public class Lesson2_KmPerHourToMiPerHour {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print(" Enter value in km/hr ");
    double kmPerhour = input.nextDouble();
    double miPerhour = kmPerhour * 0.6214;
    System.out.println(kmPerhour + " kmPerhour is: " + miPerhour + " miPerhour");

  }
}
