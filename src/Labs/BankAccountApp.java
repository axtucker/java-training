package Labs;

public class BankAccountApp {

    public static void main(String[] args) {
          BankAccount acc1 = new BankAccount("48298275", 1000);
          BankAccount acc2 = new BankAccount("48292126", 2000);
          BankAccount acc3 = new BankAccount("48293057", 2500);

          //  Setters and Getters
          acc1.setName("Jim");
          System.out.println(acc1.getName());
          acc1.makeDeposit(500);
          acc1.makeDeposit(600);
          acc1.payBill(1000);
          acc1.accrue();
          System.out.println(acc1.toString());

          acc1.setName("Sarah");
          System.out.println(acc1.getName());
          acc1.makeDeposit(1500);
          acc1.makeDeposit(60);
          acc1.payBill(500);
          acc1.accrue();
          System.out.println(acc1.toString());

    }
}

//Primary class implementing interface
class BankAccount implements IInterest {
      //Properties of Bank Account
      private static int iD = 1000;       // Internal ID
      private String accountNumber;       // iD + random 2 digit # + 1st 2 of SSN
      private static final String routingNumber = "036246203";
      private String name;
      private String SSN;
      private double balance;

      //Constructor
      public BankAccount(String SSN, double initDeposit) {
            System.out.println("New Bank Account Created");
            balance = initDeposit;
            this.SSN = SSN;
            iD++;
            setAccountNumber();
      }

      private void setAccountNumber() {
            int random = (int) (Math.random() * 100);
            accountNumber = iD + "" + random + SSN.substring(0, 2);
            System.out.println("Your Account Number is: " + accountNumber);
            System.out.println("********************");
      }

      public void setName(String name) {
            this.name = name;
      }
      public String getName() {
            return name;
      }

      public void payBill (double amount){
            balance = balance - amount;
            System.out.println("Paying Bill: " + amount);
            showBalance();
      }

      public void makeDeposit(double amount){
            balance = balance + amount;
            System.out.println("Making a deposit: " + amount);
            showBalance();
      }
      public void showBalance() {
            System.out.println("Balance: " + balance);
      }

      public void accrueInterest() {

      }

      //Override of method in interface
      @Override
      public void accrue() {
            balance = balance * (1 + rate/100);
            showBalance();
      }

      public String toString() {
            return "[Name: " + name + " ] \n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + " ]";
      }

}
