package javaexample;

public class Sum10Numbers {
    public static void main(String[] args) {
        int y = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(y += i);
        }
    }
}
