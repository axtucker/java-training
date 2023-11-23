package OOP;

public class AccountApp {

    public static void main(String[] args) {
          LoanAccount la = new LoanAccount() ;
          la.increaseRate();
          la.setRate();
          la.setAmmortSchedule();
          la.setTerm(5);

          //Polymorphism because it changes where we are pointing
          IRate account1 = new LoanAccount();
          account1.setRate();

    }
}
