package FactoryDesignPatterns.FactoryPattern;

public class YesBank implements Bank{

    public int getBalance(){
        return 100;
    }

    public int getAccount(){
        return 200;
    }

    public String createUpi(String upi){

        return upi+"@yesbank" ;
    }
}
