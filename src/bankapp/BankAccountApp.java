package bankapp;

public class BankAccountApp {

    public static void main(String[] args){
//
        Checking chck1 = new Checking("Ken", "2356221443", 3421);
        chck1.showInfo();
        chck1.transfer("Savings", 450);

        System.out.println("\n************");

        Savings svng1 = new Savings("Rich", "9285748201", 432245);
        svng1.showInfo();
        svng1.deposit(450);
    }
}
