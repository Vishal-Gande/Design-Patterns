package FactoryDesignPatterns.AbstractFactoryBank;

public interface BankFactory {
    SavingsAccount createSavingsAccount();
    InvestmentsAccount createInvestmentsAccount();
    CreditCardAccount createCreditCardAccount();
}


