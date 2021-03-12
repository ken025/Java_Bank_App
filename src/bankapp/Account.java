package bankapp;

//abstract = we will not be able to create objects from this class
//checking and savings inherit from this class = super class
public abstract class Account implements IBaseRate {
//List properties for savings & checking accounts
    String name;
    String sSN;
    double balance;
    static int index = 1000;
//    protected makes them available to child classes but hidden to the outside
    protected String acctNumber;
    protected double rate;

    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

//
//        System.out.println("\nAccount: ");
//        System.out.println("Name: " + name + "\nSSN: " + sSN + "\nBalance: $" + balance);

//  Setting account number
        index++;
        this.acctNumber = setAcctNumber();

        setRate();
    }

    private String setAcctNumber(){
        String lastTwoSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
//                                              10 to the third power = 1000
        int randNum = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoSSN + uniqueID + randNum;
    }

    public abstract void setRate();

    public void compound(){
        double accruedInterest = (balance * (rate/100));
        balance = balance + accruedInterest;
        System.out.println("\nAccrued Interest: $" + accruedInterest);
        printBalance();
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("\nDeposited: $" + amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("\nWithdrawing: $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("\nTransfering: $" + amount + " to" + toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your balance is now: $" + balance);
    }

//  Printing out user's account info
  public void showInfo(){
      System.out.println(
              "Name: " + name +
              "\nAccount Number: " + acctNumber +
                      "\nBalance: $" + balance +
                      "\nRate: %" + rate
      );
  }

//    Constructor to set base properties and initialize the acct

//    List methods: deposit, withdrawal, transfer...

}
