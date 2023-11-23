package basics;
public class SalaryCalculator {
    public static void main(String[] args) {
        //Create variable to define career

        //Declare a variable
        String career;
        System.out.println("Program is starting...");

        //Define a variable
        career = "Software Developer";
        System.out.println("My career:" + career);

        //Declare and define a variable
        int hoursPerWeek = 40;
        int weeksPerYear = 52;
        double rate = 42.50;
        career = "Web Developer";

        double salary = hoursPerWeek * weeksPerYear * rate;
        System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year");

    }

}

