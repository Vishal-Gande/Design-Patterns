package FactoryDesignPatterns.FactoryPattern;

public class Client {

    public static void main(String[] args) {

        //Optional:
        //  Here u can also include implementation for 'practical factory DP' to dynamically choose
        //  which yes/icici bank factory to call based on some input or condition
        // for eg: if input given is cost-efficient --> YesBankfactory. if input is 'reliable' choose icicifactory


        BankFactory bankFactory = new YesBankFactory(); // change just this one line to icici, if YesBank goes down.
        Bank bank = bankFactory.createBank();
        //The Client code is decoupled from the specific bank implementation. It only interacts
        // with the BankFactory interface, which promotes flexibility if you need to add more banks in the future.


        //PhonePe implementation using YesBank now
        String upicreated = bank.createUpi("bitsian");
        System.out.println(upicreated); // o/p: bitsian@yesbank
        // other phonepe utilities that use bank are followed
    }
}
