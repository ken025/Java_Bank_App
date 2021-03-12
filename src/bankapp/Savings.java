package bankapp;

public class Savings extends Account{
//    List properties and methods specific to savings acct:
    private int safetyDepositBoxID;
    private int getSafetyDepositBoxKey;

    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        acctNumber = "2" + acctNumber;
        System.out.println("\nSavings Account");

        setSafetyDepositBox();
    }

    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
//                                                           10 by the factor of 3 = 3 digits
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
//        System.out.println(safetyDepositBoxID);

        getSafetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
//        System.out.println(getSafetyDepositBoxKey);
    }

    public void showInfo(){
        super.showInfo();
        System.out.println(
                "\nSavings Account Features: " +
                        "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                        "\n Safety Deposit Box Key: " + getSafetyDepositBoxKey
        );
    }
}
