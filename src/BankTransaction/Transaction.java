package BankTransaction;

public class Transaction {
    private long accountNumber ;
    private String date;
    private int amount;
    private String type; // debit or credit
    private String location;

    public Transaction(long accountNumber, String date, int amount, String type, String location) {
        this.accountNumber = accountNumber;
        this.date = date;
        this.amount = amount;
        this.type = type;
        this.location = location;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getLocation() {
        return this.location;
    }

    public String getType(){
        return this.type;
    }

    public String getDate(){
        return this.date;
    }
}




