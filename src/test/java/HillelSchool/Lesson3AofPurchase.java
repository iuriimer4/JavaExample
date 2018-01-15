package HillelSchool;

public class Lesson3AofPurchase {
  public static void main(String[] args) {
    double total = discountPrice(900, 15);
    System.out.println("Total to pay " + total);
  }

  public static double discountPrice(double a, double d) {
    double total;
    if (a > 1000) {
      System.out.println("Discount is Provided");
      return total = a - (a / 100 * d);
    } else {
      System.out.println("Discount is not provided");
      return total = a;
    }
  }
}

