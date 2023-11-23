package OOP;

public class BankAccountApp {

    public static void main(String[] args) {
//Creating a new bank account >> Think instantiate an object

        BankAccount acc1 = new BankAccount();

        //Below variable definition is a bad practice as it exposes the variable to the world
        //acc1.name = "Roger Hue";
        //Defining a variable with encapsulation
        acc1.setName("Roger Mue");
        System.out.println(acc1.getName());
        acc1.setSsn("237592123");
        System.out.println("SSN: " + acc1.getSsn());

        acc1.accountNumber = "2742492304";
        acc1.balance = 10000;
        acc1.setRate();
        acc1.increaseRate();


        acc1.deposit(1500);

        //Polymorphism thru overriding.toString is overridden in the BankAccount child class
        System.out.println(acc1.toString());

        //Polymorphysm thru overloading.  CAll same method and constructor but different based on arguments
        BankAccount acc2 = new BankAccount("Checking Account");
        acc2.accountNumber = "734528535";
        acc2.checkBalance();

        BankAccount acc3 = new BankAccount("Savings Account ", 5000);
        acc3.accountNumber = "023735653";

        /*
        acc3.checkBalance();

        //System.out.println(acc1.routingNumber);
        //System.out.println(acc2.routingNumber);
        //System.out.println(acc2.routingNumber);


        //Demo for Inheritance
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
        cd1.interestRate = "4.5";
        cd1.name = "Juan";
        cd1.accountType = "CD Account";
        System.out.println(cd1.toString());
        cd1.compound();
*/
    }
}
