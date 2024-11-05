package AbstractFactoryPattern;

public class YesBankSavingsAccount implements SavingsAccount {

   public void getBalance(){
        //include yes bank specific implementation for getBalance
        System.out.println("Yes bank savings account balance is x");
    }
}
