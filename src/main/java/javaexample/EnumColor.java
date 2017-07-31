package javaexample;



    enum Color {
        RED, GREEN, BLUE;

    }

    public class EnumColor {
    public static void main(String[] args) {
        Color color = Color.BLUE;

        switch (color) {
            case BLUE:
                System.out.println("1");
                break;
            case GREEN:
                System.out.println("2");
                break;
            case RED:
                System.out.println("0");
                break;

        }


    }


}
