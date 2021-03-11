package bankapp;

public class Savings extends Account{

//    List properties and methods specific to savings acct:
    public Savings(String name){
        super(name);
        System.out.println("New Savings acct by: " + name);
    }
}
