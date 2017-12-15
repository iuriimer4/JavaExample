package HillelSchool;

import java.util.Scanner;

public class Lesson2_TestScore {

    public static void main(String[] args) {
        double markOnTest = 0;
        double totalScore = 0;
        float percentage;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter mark on a test: ");
        markOnTest = input.nextDouble();
        System.out.print("Enter total score: ");
        totalScore = input.nextDouble();
        percentage = (float) ((markOnTest * 100)/totalScore);
        System.out.println("Percentage is: " + percentage + " % ");




    }

}
