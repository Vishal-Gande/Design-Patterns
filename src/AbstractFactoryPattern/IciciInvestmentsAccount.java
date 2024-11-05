package AbstractFactoryPattern;

public class IciciInvestmentsAccount implements InvestmentsAccount {

    public void createDemat(){
        // Icici bank specific code for creating demat account
        System.out.println("icici bank demat account created");
    }
}
