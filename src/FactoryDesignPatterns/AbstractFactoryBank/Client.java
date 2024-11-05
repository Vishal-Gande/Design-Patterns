package FactoryDesignPatterns.AbstractFactoryBank;

public class Client {

    public static void main(String[] args) {

        BankFactory yesbankfactory = new YesBankBankFactory();
       InvestmentsAccount vishinvests = yesbankfactory.createInvestmentsAccount();
       vishinvests.createDemat();

       CreditCardAccount vishcreditcard = yesbankfactory.createCreditCardAccount();
       vishcreditcard.issueCreditCard();

    }
}
