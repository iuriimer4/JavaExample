package javaexample;

public class ToString {

    public static void main(String args[]) {
        Integer x = 5;

        System.out.println(x.toString(12));
        System.out.println(Integer.toString(12));

        Animal a = new Animal();
        String outputString = "This is a test " + a + " other stuff";
        //System.out.println();
        System.out.println(a);
    }
}

