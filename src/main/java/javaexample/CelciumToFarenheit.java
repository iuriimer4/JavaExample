package javaexample;

public class CelciumToFarenheit {
        public static void main(String[] args) {
            System.out.println(convertCelsiumToFahrenheit(40));
        }

        public static double convertCelsiumToFahrenheit(int celsium) {
            return (double) celsium*9/5+32;

        }
    }


