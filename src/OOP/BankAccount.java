package OOP;

public class BankAccount implements IRate {
//Define Variables
    String accountNumber;

    //Static belongs to the Class, not the object instance
    //Final is a constant.  Often static and final go together
    private static final String routingNumber = "7364246";

    //Instant variables
    private String name;
    private String ssn;
    String accountType;
    double balance = 0;

    //Constructor definitions:  unique methods
      //1. Used to define/setup/initialize properties of an object
      //2. Constructors are implicitly called upon instantiation
      //3. Has the same name as the class itself
      //4. Constructors have no return type
      BankAccount() {
            System.out.println("New account created");
      }
      //Overloading: call same method name with different arguments
      BankAccount(String accountType){
            System.out.println("New account: " + accountType);
      }
      BankAccount(String accountType, double initDeposit){
          //initDeposit, accountType, Msg are all local variables, only available in the block they are defined in
            System.out.println("New account: " + accountType);
            System.out.println("Initial deposit of: " + initDeposit);
            String Msg = null;
            if (initDeposit < 1000) {
                Msg = "ERROR:  Minimum deposit must be at least $1,000";
            } else {
                Msg = "Thanks for your initial deposit of: $" + initDeposit;
            }
          System.out.println(Msg);
            balance = initDeposit;
      }

      //Getters and setters
    //Allow the user to define the name, populate the variable
    public void setName(String name) {
          this.name = "Mr " + name;
    }
    public String getName() {
          return name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    //Interface methods
    public void setRate() {
        System.out.println("Setting Rate");
    }

    public void increaseRate() {
        System.out.println("Increasing Rate");
    }

    //Define methods
    public void deposit(double amount) {
          balance = balance + amount;
          showActivity("DEPOSIT");

    }
    void withdraw(double amount) {
          balance = balance - amount;
          showActivity("WITDRAWL");
    }

    //Private: Can only be called from within the class
    private void showActivity(String activity) {
        System.out.println("Your recent transaction: " + activity);
        System.out.println("Your new balance is: $" + balance);
    }

    void checkBalance() {
        System.out.println("Balance : $" + balance);
    }

    void getStatus() {

    }

    @Override
    public String toString() {
          return "[ Name: " + name + ". Account #: " + accountNumber + ". Routing #: " + routingNumber + ". Balance: " + balance + " ]";
    }

}
