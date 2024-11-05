package FactoryDesignPatterns.FactoryPattern;

public class IciciFactory implements BankFactory {

    public Bank createBank() {
        return new Icici();
    }
}
