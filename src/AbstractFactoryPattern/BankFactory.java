package AbstractFactoryPattern;

public interface BankFactory {
    SavingsAccount createSavingsAccount();
    InvestmentsAccount createInvestmentsAccount();
    CreditCardAccount createCreditCardAccount();
}
