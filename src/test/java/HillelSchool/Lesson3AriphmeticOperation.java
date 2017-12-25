package HillelSchool;

public class Lesson3AriphmeticOperation {

  public static void main(String[] args) {
    int a = 2;
    int b = 3;
    a = a * a;
    a = a * a;

    a = a * a;
    b = a * a;
    a = a * b;
  }

  public static void purshaseSumma() {
    double price = 1100;
    if (price > 1000) {
      price = price * 0.85;
      System.out.println(" Purchase price " + price + " USD");

    } else {
      System.out.println(" There are no discounts");
    }

  }

}


