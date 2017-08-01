package javaexample;

public class MinThreeNumbers {
    public static int min(int a, int b, int c) {
        int min1 = 0;

        if (a < b && a < c) {
            min1 = a;
        } else if (b < a && b < c) {
            min1 = b;

        } else if (c <= a && c <= b) {
            min1 = c;
        }
            return min1;
        }
        public static void main (String[]args) throws Exception {
            System.out.println(min(1, 2, 3));
            System.out.println(min(-1, -2, -3));
            System.out.println(min(3, 5, 3));
            System.out.println(min(10, 5, 10));
        }
    }
