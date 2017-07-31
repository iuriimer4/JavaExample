package javaexample;

public class ExampleClass {
   private String salary = "4 Thousand";
   private static int day = 25;

    ExampleClass() {
    }

    ExampleClass( String salary, int day)  {
        this.salary = salary;
        this.day = day;
   /* }
    public void setSalary() {
        salary = salary;

    }
    public void setDay() {
        day  = day;*/
    }
    public void printStaticVariables()
    {
        System.out.println("Salary: " + salary);
        System.out.println("Day:    " + day);
    }

    public static void main(String[] args) {
        ExampleClass c = new ExampleClass("5 Thousand", 54);
        c.printStaticVariables();
        System.out.println();

        ExampleClass d = new ExampleClass("7 Thousdan", 1726);
        c.printStaticVariables();
        d.printStaticVariables();
        System.out.println();

        ExampleClass otherClass = new ExampleClass("6 Thousand", 67);
        c.printStaticVariables();
        otherClass.printStaticVariables();

        /*c.getSalary("4 thousands");
        c.getDay(25);

        System.out.println("Salary: " + c.salary);
        System.out.println("Day: " + c.day);*/

    }

//    private static String getSalary(String s) {
//        return salary;
//    }

    private static int getDay(int i) {
        return day;
    }


}
