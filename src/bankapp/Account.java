package bankapp;

//abstract = we will not be able to create objects from this class
//checking and savings inherit from this class = super class
public abstract class Account implements IBaseRate {
//List properties for savings & checking accounts
    String name;
    String sSN;
    double balance;
    static int index = 1000;
    String acctNumber;
    double rate;

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

    public abstract void setRate();

    private String setAcctNumber(){
        String lastTwoSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
//                                              10 to the third power = 1000
        int randNum = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoSSN + uniqueID + randNum;
  }

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
