package javaexample;

public class Palindrome {
    public static void main(String args[]) {
            String s1 = "Frad";
            String s2 = "Frad";
            String s3 = "Frank";
            String s4 = new String("Phillip");
            int s5 = 20;

            String palindrome = " Dot saw I was Tod ";
            String parse = " Parse ";
            int s6 = 25;

            int len1 = parse.charAt(2);
            System.out.println(parse.charAt(2));

            int len2 = parse.compareTo(palindrome);
            System.out.println(parse.compareTo(palindrome));

            String len3 = parse.concat(palindrome);
            System.out.println(parse.concat(palindrome));

            boolean len4 = parse.contentEquals(s1);
            System.out.println(parse.contentEquals(s1));

            int len = palindrome.length();
            System.out.println( "String Length is : " + len );


            System.out.println(parse.compareToIgnoreCase(palindrome));
            System.out.println(String.valueOf(25));

        System.out.println(parse.equals(palindrome));
        System.out.println(palindrome.toUpperCase());
        System.out.println(Integer.toString(50));
        }
}

