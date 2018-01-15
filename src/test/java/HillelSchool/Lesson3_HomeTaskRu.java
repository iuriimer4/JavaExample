package HillelSchool;

import java.util.Scanner;

public class Lesson3_HomeTaskRu {

  public static void main(String[] args) {
    checkOddEven();
    checkPassFail();
    printNumberInWord();
    printNumberInWordSwitchCase();
    printDayInWord();
    printDayInWordSwitchCase();
    greatestValue();
    six();
    magnitude();
    eight();

  }

  public static void checkPassFail() {
    int mark = 51;

    if (mark >= 50) {
      System.out.println("Pass");
    } else {
      System.out.println("Fail");
    }
    System.out.println("Done");

  }

  public static void checkOddEven() {
    int number = 0;
    if (number % 2 < 1) {
      System.out.println("Чмсло четное, Even Number");
    } else {
      System.out.println("Odd number, не делится на 2");
    }
    System.out.println("BYE");
  }

  public static void printNumberInWord() {
    int number = 1;
    if (number == 1) {
      System.out.println("ONE");
    } else if (number == 2) {
      System.out.println("TWO");

    } else if (number == 3) {
      System.out.println("THREE");
    } else if (number == 4) {
      System.out.println("Four");
    } else if (number == 5) {
      System.out.println("FIVE");
    } else if (number == 6) {
      System.out.println("SIX");
    } else if (number == 7) {
      System.out.println("SEVEN");
    } else if (number == 8) {
      System.out.println("EIGHT");
    } else if (number == 9) {
      System.out.println("NINE");
    } else if (number < 1 || number > 9) {
      System.out.println("OTHER");
    }

  }

  public static void printNumberInWordSwitchCase() {
    int number = 0;
    switch (number) {
      case 1:
        System.out.println("ONE");
        break;
      case 2:
        System.out.println("TWO");
        break;
      case 3:
        System.out.println("Three");
        break;
      case 4:
        System.out.println("FOUR");
        break;
      case 5:
        System.out.println("FIVE");
        break;
      case 6:
        System.out.println("SIX");
        break;
      case 7:
        System.out.println("SEVEN");
        break;
      case 8:
        System.out.println("EIGHT");
        break;
      case 9:
        System.out.println("NINE");
        break;
      default:
        System.out.println("OTHER");

    }

  }

  public static void printDayInWord() {
    int day = 3;
    if (day == 1) {
      System.out.println("Monday");

    } else if (day == 2) {
      System.out.println("Tuesday");
    } else if (day == 3) {
      System.out.println("Wednesday");
    } else if (day == 4) {
      System.out.println("Thursday");
    } else if (day == 5) {
      System.out.println("Friday");

    } else if (day == 6) {
      System.out.println("Saturday");
    } else if (day == 7) {
      System.out.println("Sunday");
    } else if (day > 7) {
      System.out.println("Not a valid day");
    }
  }

  public static void printDayInWordSwitchCase() {
    int day = 5;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Not a valid day");
    }

  }

  public static void greatestValue() {
    int a = 80;
    int b = 30;
    if (a > b) {
      System.out.println("The number a has the greatest value: " + a);
    } else {
      System.out.println("Thw number b has the greates value: " + a);

    }
  }

  public static void six() {
    //ax + b = 0; x= -b/a;
    int a = 1;
    int b = 2;
    int x = 1;
    if (a == 0 || b == 0) {
      System.out.println("Деление на ноль невозможно а и в не ноль");
    } else {
      x = -b / a;
      System.out.println(x);
    }

  }

  public static void magnitude() {
    int a = 3;
    int b = -9;
    if (Math.abs(a) > Math.abs(b)) {
      System.out.println("Число " + a + " имеет большую величину");
    } else {
      System.out.println("Число " + b + " имеет юольшую величину");
    }
  }

  public static void eight() {
    //ax2+bx+c = 0;
    //a=0;
    //d<0 -no
    //d==0 x1==x2;
    //d>0 - Два корня
    double a, b, c;
    double D;
    System.out.println(" ax^2+bx+c ");
    System.out.println(" Введите: a, b, c: ");

    Scanner in = new Scanner(System.in);
    a = in.nextDouble();
    b = in.nextDouble();
    c = in.nextDouble();

    D = b * b - 4 * a * c;
    if (a == 0) {
      System.out.println("a can't be 0");
    } else if (D < 0) {
      System.out.println("Решений нет");
    } else if (D == 0) {
      double x;
      x = -b / (2 * a);
      System.out.println("Один корень: x= " + x);
    } else if (D > 0) {
      double x1, x2;
      x1 = (-b - Math.sqrt(D)) / (2 * a);
      x2 = (-b + Math.sqrt(D)) / (2 * a);
      System.out.println("Корни уравнения: x1= " + x1 + ", x2 = " + x2);
    } else {
      System.out.println("Уравненинея не имеет корней");
    }

  }

}




