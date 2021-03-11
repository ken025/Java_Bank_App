package bankapp;

public class Savings extends Account{
//    List properties and methods specific to savings acct:
    int safetyDepositBoxID;
    int getSafetyDepositBoxKey;

    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        acctNumber = "2" + acctNumber;
//        System.out.println("Account Number: " + this.acctNumber);
//        System.out.println("Savings Account");
    }
}
