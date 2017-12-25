package HillelSchool;

import java.util.Scanner;

public class IntervalDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter value a: ");
    int a = input.nextInt();
    if (a > -5 && a < 3 ) {
      System.out.println("Digit in a range -5, 3 ");
    }else{
      System.out.println("Digit out of range");
    }
  }

}
