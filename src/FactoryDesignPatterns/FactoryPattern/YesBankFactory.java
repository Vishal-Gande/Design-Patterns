package FactoryDesignPatterns.FactoryPattern;

public class YesBankFactory implements BankFactory{

    public Bank createBank() {
        return new YesBank();
    }

}
