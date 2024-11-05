package AbstractFactoryPattern;

public class YesBankBankFactory implements BankFactory {

    public SavingsAccount createSavingsAccount() {
        return new YesBankSavingsAccount();
    }

    public CreditCardAccount createCreditCardAccount() {
        return new YesBankCreditCardAccount();
    }

    public InvestmentsAccount createInvestmentsAccount() {
        return new YesBankInvestmentsAccount();
    }

}

