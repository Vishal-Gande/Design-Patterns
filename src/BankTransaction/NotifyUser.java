package BankTransaction;

public class NotifyUser implements BankTransactionObservers{

    public NotifyUser(SBI sbi) {
        sbi.addTransactionObserver(this);
    }

    public void sendtransactionUpdateSMS(Transaction transaction)
    {
        System.out.println("You've made a transaction (" + transaction.getType() +
                            ") of amount " + transaction.getAmount() + "at " +
                            transaction.getLocation() + "on " + transaction.getDate());
    }

    public void onTransaction(Transaction transaction){
            this.sendtransactionUpdateSMS(transaction);
    }
}
