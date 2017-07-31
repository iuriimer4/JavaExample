package javaexample;

public class Employee {

    private String name;
    private int age;
    private String designation;
    private static String speech;

    public Employee(String name, int age, String designation, String speech) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.speech = speech;

        int localVariable = 5;

        double scopeDemonstration = 7.0;
        if (localVariable == 5) {
            System.out.println(scopeDemonstration);
        }
    }
        public void printmethod()  {
        System.out.println("Emloyee name: " + name);
        System.out.println("Emloyee age: " + age);
        System.out.println("Emloyee designation: " + designation);
        System.out.println("Employee speech: "  + speech);
    }


    public void work() {
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Frank", 28, "Developer", speech = "new");

        emp.printmethod(); {
        }
    }

    private void run() {
    }

    public void talk() {
    }
   
}


