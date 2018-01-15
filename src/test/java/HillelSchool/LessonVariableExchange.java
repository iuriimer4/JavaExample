package HillelSchool;

public class LessonVariableExchange {
  public static void main(String[] args) {
    double a = variableExchange(10, 42);
    double b = variableExchange1(20, 33);
    System.out.println("Exchange beetween two variables  - " + " a + " + a);
    System.out.println("Exchange between two variables using trird one - " + " a = " + b);
  }

  private static double variableExchange(double a, double b) {
    return a = a + b - (b = a);

  }

  private static double variableExchange1(double a, double b) {
    double c = a + b;
    return a = c - a;
  }

}
