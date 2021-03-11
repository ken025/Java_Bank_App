package bankapp;

public class Checking extends Account{

//    List properties and methods specific to checking acct:
    public Checking(String name){
        super(name);
        System.out.println("New Checking Acct by: " + name);
    }
}
