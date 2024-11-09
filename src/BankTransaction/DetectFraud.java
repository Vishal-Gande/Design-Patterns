package BankTransaction;

public class DetectFraud implements BankTransactionObservers {



    public DetectFraud(SBI sbi)
    {
        sbi.addTransactionObserver(this);
    }

    public boolean detectFraud(Transaction transaction) {
        // put all the logic for fraud detection here
        System.out.println("Detecting fraud..");
        return true;
    }

    public void onTransaction(Transaction transaction) {
        this.detectFraud(transaction);
    }
}
