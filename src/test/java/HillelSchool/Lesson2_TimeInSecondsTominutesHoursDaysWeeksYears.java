package HillelSchool;

import java.util.Scanner;

public class Lesson2_TimeInSecondsTominutesHoursDaysWeeksYears {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value in seconds: ");
    int input = sc.nextInt();

    int minutes = (input % 3600) / 60;
    int hours = input / 3600;
    int days = input / 86400;
    int weeks = input / 604800;
    int years = input / 604800;

    System.out.println(minutes + " minutes");
    System.out.println(hours + " hours");
    System.out.println(days + " days");
    System.out.println(weeks + " weeks");
    System.out.println(years + " years");


  }
}
