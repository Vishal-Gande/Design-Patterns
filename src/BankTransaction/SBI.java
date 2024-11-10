package BankTransaction;

import java.util.ArrayList;
import java.util.List;

public class SBI {

    public List<BankTransactionObservers> transactionObservers = new ArrayList<BankTransactionObservers>();

    public void addTransactionObserver(BankTransactionObservers observer)
    {
        transactionObservers.add(observer);
    }

    public void removeTransactionObserver(BankTransactionObservers observer)
    {
        transactionObservers.remove(observer);
    }

    public void onTransaction(Transaction transaction){
        for(BankTransactionObservers observer : transactionObservers){
            Thread thread = new Thread(() -> observer.onTransaction(transaction));
            thread.start();
            //observer.onTransaction(transaction);
        }
    }
}
