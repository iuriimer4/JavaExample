package HillelSchool;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Lesson4 {
  public static void main(String[] args) {
    findMinInArray();
    sortArray();
    palindrom();
    reversString();
    fibonacci();
  }

  public static void findMinInArray() {
    int[] array = {5, 10, 70, 85, 100, 55, 65, 45, 78, 40, 10, 3, -2, 14};
    int min = array[0];

    for (int i = 1; i < array.length; i++) {
      if (min > array[i]) {
        min = array[i];
      }
    }
    System.out.println("Minimum is: " + min);
  }

  public static void sortArray() {
    int[] array = {8, 9, 6, 1, 7, 10, 100, 13, 0, 65, 89, 2, -90};
    int temp;
    boolean isSorted = false;
    int endOfErray = array.length - 1;

    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < endOfErray; i++) {
        if ((array[i] > array[i + 1])) {
          temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          isSorted = false;
        }
      }
      endOfErray--;
    }
    System.out.println(Arrays.toString(array));
  }

  public static void palindrom() {
    String text;
    boolean sameChars = true;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string");
    text = scan.nextLine();

    char[] chars = text.toCharArray();
    for (int i = 0; i < chars.length / 2; i++) {
      if (chars[i] != chars[chars.length - 1 - i]) {
        sameChars = false;

        if (sameChars) {
          System.out.println("It Palindrom!");
        } else {
          System.out.println("It not palindrom");
        }
      }
    }


  }

  public static void reversString() {
    String text;
    String reverse;
    char temp;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string: /n");

    text = scan.nextLine();
    char[] chars = text.toCharArray();
    for (int i = 0; i < chars.length / 2; i++) {
      temp = chars[i];
      chars[i] = chars[chars.length - 1 - i];
      chars[chars.length - 1 - i] = temp;
    }
    reverse = new String(chars);
    System.out.println(reverse);

  }

  public static void fibonacci() {
    int a = 0;
    int b = 1;
    int c = 1;
    int b1 = -1;

    System.out.println("Enter max number: ");
    Scanner scan = new Scanner(System.in);
    while (!scan.hasNextInt()) {
      System.out.println(" Try again! Enter integer number: ");
      scan.next();

      int max = scan.nextInt();
      if (max >= 0) {
        while ((a + b) < max) {
          c = a + b;
          a = b;
          b = c;
          System.out.println(" " + c);
        }
      } else {
        while (c >= max) {
          c = a + b1;
          a = b1;
          b1 = c;
          System.out.println(" " + c);

        }
      }
    }
  }
}