package bankapp;

import java.util.List;

public class BankAccountApp {

    public static void main(String[] args){
        String file = "iCloudDrive/Documents/NewBankAccounts.csv";

        List<String[]> newAcctHolders = utilities.CSV.read(file);
        for (String[] acctHolder : newAcctHolders){
            System.out.println(acctHolder[0]);
            System.out.println(acctHolder[2]);
            System.out.println(acctHolder[3]);
        }

// Unit Testing
//        Checking chck1 = new Checking("Ken", "2356221443", 3421);
//        chck1.showInfo();
//        chck1.transfer("Savings", 450);
//        chck1.compound();
//
//        System.out.println("\n************");
//
//        Savings svng1 = new Savings("Rich", "9285748201", 432245);
//        svng1.showInfo();
//        svng1.deposit(450);
//        svng1.compound();
    }
}
