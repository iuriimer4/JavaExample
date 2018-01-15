package HillelSchool;

public class SquareCircle {
  public static void main(String[] args) {
    double a = 10;
    double d = diameterOfCircle(50);
    if (d < a) {
      System.out.println("Circle is inside the square");
    } else {
      System.out.println("Square is inside the circle");
    }
    System.out.println("Diameter of the circle is " + d);
    System.out.println("Diagonal of of the square is " + a);
  }

  private static double diameterOfCircle(double s) {
    double d;
    return d = 2 * Math.sqrt(s / Math.PI); // S = pr2
  }
}
