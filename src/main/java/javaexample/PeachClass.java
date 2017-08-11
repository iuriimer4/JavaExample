package javaexample;

public class PeachClass {
    public void pluck() { }

    void fall(){}


    public static void main(String[] args) {
    PeachClass p = new TreeClass();
    p.fall();
    p.pluck();



    TreeClass m = (TreeClass) p;
    m.grow();
    m.fall();
    m.pluck();







    }
}
