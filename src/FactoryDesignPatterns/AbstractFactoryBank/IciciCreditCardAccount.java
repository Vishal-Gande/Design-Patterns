package FactoryDesignPatterns.AbstractFactoryBank;

public class IciciCreditCardAccount implements CreditCardAccount {

    public void issueCreditCard(){

        //check if cibil score is above 800 (specific to icici bank)
        System.out.println("icici Bank issued Credit Card");
    }
}
