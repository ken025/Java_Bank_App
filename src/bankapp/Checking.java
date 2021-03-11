package bankapp;

public class Checking extends Account{
//    List properties and methods specific to checking acct:
    int debitCardNum;
    int debitCardPIN;

    public Checking(String name, String sSn, double initDeposit){
        super(name, sSn, initDeposit);
        acctNumber = "1" + acctNumber;
//        System.out.println("Account Number: " + this.acctNumber);
//        System.out.println("Checking Account");
    }
}
