package AbstractFactoryPattern;

public class IciciBankFactory implements BankFactory {

    public SavingsAccount createSavingsAccount(){
        return new IciciSavingsAccount();
    }

    public CreditCardAccount createCreditCardAccount(){
        return new IciciCreditCardAccount();
    }

    public InvestmentsAccount createInvestmentsAccount(){
        return new IciciInvestmentsAccount();
    }
}


