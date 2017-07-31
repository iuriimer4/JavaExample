package javaexample;

public class EnumsClass {
    enum Rank {
        SOLDIER,
        SERGEANT,
        CAPTAIN
    }

    public static void main(String[] args) {
        Rank a = Rank.SOLDIER;
        Rank c = Rank.SERGEANT;
        Rank b = Rank.CAPTAIN;

        if (a == Rank.SERGEANT) {
            System.out.println("Soldier says hi!");
        } else if (c == Rank.SOLDIER) {
            System.out.println("Sergeant says Hello!");
        } else if (b == Rank.SOLDIER) {
            System.out.println("Captain says Welcome!");
        } else  {
            System.out.println("None");
        }



            /*switch(c) {
                case SOLDIER:
                    System.out.println("Soldier says hi!");
                    break;
                case SERGEANT:
                    System.out.println("Sergeant says Hello!");
                    break;
                case CAPTAIN:
                    System.out.println("Captain says Welcome!");
                    break;*/


    }
}

