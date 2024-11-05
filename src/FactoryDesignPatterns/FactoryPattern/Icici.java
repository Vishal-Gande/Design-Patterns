package FactoryDesignPatterns.FactoryPattern;

public class Icici implements Bank{

    public int getBalance(){
        return 10000;
    }

    public int getAccount(){
        return 10000;
    }

    public String createUpi(String upi){

        return upi+ "@icici";
    }
}
