package FactoryDesignPatterns.AbstractFactoryBank;

public class IciciSavingsAccount implements SavingsAccount {

    public void getBalance(){
        //include icici bank specific implementation for getBalance
        System.out.println("icici bank savings account balance is y");
    }
}
