package AbstractFactoryPattern;

public class YesBankInvestmentsAccount implements InvestmentsAccount {

    public void createDemat(){
        // Yesbank specific code for creating demat account
        System.out.println("Yesbank demat account created");
    }
}
