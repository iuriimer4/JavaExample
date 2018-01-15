package HillelSchool;

public class DigitsDivision {


  public static void main(String[] args) {
    double results = dividerAB(40, 2);
    if (results == 0) {
      System.out.println("Да, одно из чисел является делителем другого");
    } else {
      System.out.println("Ни одно из чисел является делителем другого");
    }
  }

  public static double dividerAB(double a, double b) {
    double results = 0;
    return results = a % b;

  }
}