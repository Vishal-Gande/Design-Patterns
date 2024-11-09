package BankTransaction;

public class AccountBalance implements BankTransactionObservers{

    public AccountBalance(SBI sbi) {
        sbi.addTransactionObserver(this);
    }

    public void updateBalance(Transaction transaction){

        if(transaction.getType() == "credit")
            System.out.println("Increasing balance by " + transaction.getAmount());

        else if(transaction.getType() == "debit")
            System.out.println("reducing balance by " + transaction.getAmount());


    }

    public void onTransaction(Transaction transaction){
        this.updateBalance(transaction);
    }
}
