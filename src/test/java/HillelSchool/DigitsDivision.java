package HillelSchool;

public class DigitsDivision {
  public static void main(String[] args) {
    int a = 4;
    int b = 5;

    if (a % b == 0 || b % a == 0){
      System.out.println("Да, одно из чисел является делителем другого");
    }else {
      System.out.println("Ни одно из чисел является делителем другого");
    }
  }
}