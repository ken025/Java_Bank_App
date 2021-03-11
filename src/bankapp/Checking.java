package bankapp;

public class Checking extends Account{
//    List properties and methods specific to checking acct:
    int debitCardNum;
    int debitCardPIN;

    public Checking(String name, String sSn, double initDeposit){
        super(name, sSn, initDeposit);
        acctNumber = "1" + acctNumber;
        System.out.println("\nChecking Account");

        setDebitCard();
    }

    public void setRate(){
        rate = getBaseRate() * .15;
    }

    private void setDebitCard(){
        debitCardNum = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(
                "\nChecking Account Features: " +
                        "\n Debit Card Number: " + debitCardNum +
                        "\n Debit Card Pin: " + debitCardPIN
        );
    }
}
