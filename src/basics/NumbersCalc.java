package basics;

public class NumbersCalc {
    public static void main(String[] args) {
        System.out.println("Program is starting...");
        printName();
        int numA = 10;
        int numB = 20;
        addNumbers(numA, numB);
        int product = multiplyNumbers(numA, numB);
       //Next 2 lines are 2 different ways to accomplish the same thing
        System.out.println("The product of numbers " + numA + " and " + numB + " is " + multiplyNumbers(numA, numB));
        System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
    }
        static void printName() {
            System.out.println("My name is Andrew");

        }
        static void addNumbers(int numberA, int numberB) {
        //This function will add two numbers
            int sum = numberA + numberB;
            System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
        }

        //This is a function with a return type.  It returns the value of product.  It is then used in the print function in the main above
        static int multiplyNumbers(int valueA, int valueB) {
        int product = valueA * valueB;
        addNumbers(product + 50, product);
        return product;

    }

}
