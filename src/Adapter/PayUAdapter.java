package Adapter;

public class PayUAdapter implements PaymentGW{

    PayUAPI payuAPI = new PayUAPI();

    public void qr_code_generator(){

        // we're trying use respective code of payu api's scanner
        System.out.println("calling payU API for qr_code_generator");
        payuAPI.scanner_display();

    }
    public void generate_OTP(){
        System.out.println("calling payU API for generate_OTP");

        // notice how we're giving mobile as argument
        payuAPI.otp("mobile");
    }
    public void makePayment(){
        System.out.println("calling payU API for makePayment");
        payuAPI.complete_payment();
    }
}
