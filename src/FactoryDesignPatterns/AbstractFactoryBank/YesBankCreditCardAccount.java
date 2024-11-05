package FactoryDesignPatterns.AbstractFactoryBank;

public class YesBankCreditCardAccount implements CreditCardAccount {

    public void issueCreditCard(){

        //check if cibil score is above 775 (specific to yesbank)
        System.out.println("YesBank issued Credit Card");
    }
}
