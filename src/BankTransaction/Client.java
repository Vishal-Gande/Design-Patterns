package BankTransaction;

import FactoryDesignPatterns.FactoryPattern.Bank;

public class Client {

    public static void main(String[] args) {

        SBI sbi = new SBI();
        DetectFraud df = new DetectFraud(sbi);
        NotifyUser nu = new NotifyUser(sbi);
        AccountBalance ab = new AccountBalance(sbi);

        Transaction transaction = new Transaction(4536272, "Nov 10th 2024", 990, "debit", "Borabanda");

        sbi.onTransaction(transaction);
    }

}
