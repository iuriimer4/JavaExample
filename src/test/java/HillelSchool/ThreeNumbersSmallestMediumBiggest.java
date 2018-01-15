package HillelSchool;

public class ThreeNumbersSmallestMediumBiggest {
  public static void main(String[] args) {
    int a = 1;
    int b = 3;
    int c = 5;

    if (a > b) {
      if (a > c) {
        if (b > c) {
          System.out.println("The nimber 'a' the biggest number");
          System.out.println("The number 'b' is the medium number");
          System.out.println("The number 'c' is the smallest number ");
        } else {
          System.out.println("The number 'a' is the biggest out of three given numbers");
          System.out.println("The number 'c' is the medium out of three given numbers");
          System.out.println("The number 'b' is the smallest out of three given numbers");

        }
      }
    }
    if (b > a) {
      if (b > c) {
        if (a > c) {
          System.out.println("The number 'b' is the biggest out of three given numbers");
          System.out.println("The number 'a' is the medium out of three given numbers");
          System.out.println("The number 'c' is the smallest out of three given numbers");
        } else {
          System.out.println("The number 'b' is the biggest out of three given numbers");
          System.out.println("The number 'c' is the medium out of three given numbers");
          System.out.println("The number 'a' is the smallest out of three given numbers");
        }
      }
    }
    if (c > a) {
      if (c > b) {
        if (a > b) {
          System.out.println("The number 'c' is the biggest out of three given numbers");
          System.out.println("The number 'a' is the medium out of three given numbers");
          System.out.println("The number 'b' is the smallest out of three given numbers");
        } else {
          System.out.println("The number 'c' is the biggest out of three given numbers");
          System.out.println("The number 'b' is the medium out of three given numbers");
          System.out.println("The number 'a' is the smallest out of three given numbers");
        }
      }
    }
  }
}
