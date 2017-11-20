package javaexample;

public class StringReverse {
        public static void main(String[] args) {
            //String to reverse.
            String str = "This Is String.";
            String revstring = "";

            for (int i = str.length() - 1; i >=0; --i) {
                //Start getting characters from end of the string.
                revstring += str.charAt(i);
            }
            System.out.println(revstring);
        }
    }

