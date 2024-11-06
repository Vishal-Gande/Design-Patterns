package Adapter;

public class RazorpayAPI {

    // has it's own implementation and different method names
    // as it's a third party library we cannot expect it to implement our interface

    public void generate_QR_code(int DisplaySize){
        System.out.println("Generate QR code from razorpay");
    }

    public void generate_mobileOTP(){
        System.out.println("Generated mobileOTP from razorpay");
    }

    public void payment(){
        System.out.println("completed payment from razorpay");
    }
}
