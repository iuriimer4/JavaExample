package javaexample;

public class Elephant extends Animal {
    int age = 40;

    Elephant() {
        //call constructor method of parent class
        super();
        System.out.println("Elephant is running.");

        welcome();
        //Call Parent class method
        super.welcome();
    }

    void welcome() {
        System.out.println("Welcome to Elephant class.");
    }

    public static void main(String[] args) {
        //create constructor elephant class
        Elephant c = new Elephant();
        //call showage method of current class
        c.showAge();
    }

    void showAge() {
        //Invoke age variable in current class
        System.out.println("Average age of elephants: " + age);
        //Use super.age to access parent class variable
        System.out.println("Average age of Animals: " + super.age);
    }
}
    