package javaexample;

public class P {
    boolean isPalindrome(String str) {
        str = str.toUpperCase();
        int n = str.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static boolean xyz()
    {
        return true;
    }
    public static void main(String[] args) {
        int num1 = 5;
        int num2;
         //Make num1 and num2 both have 5
        num2 = num1;

        boolean trueBoolean;
        trueBoolean = xyz();
        //We can make the above two statements do the exact same thing as the statement below this comment
        boolean trueBoolean2 = true;

        P p = new P();
       boolean stringIsPalindrome;
       stringIsPalindrome = p.isPalindrome("raceCAR");

        System.out.println(stringIsPalindrome);
    }
}