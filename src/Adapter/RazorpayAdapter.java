package Adapter;

public class RazorpayAdapter implements PaymentGW{

    RazorpayAPI razorpayAPI = new RazorpayAPI();

    public void qr_code_generator(){
        System.out.println("calling qr gen api of razorpay");
        razorpayAPI.generate_QR_code(200);

    }

    public void generate_OTP(){
        System.out.println("calling generate OTP of razorpayAPI ");
        razorpayAPI.generate_mobileOTP();
    }

    public void makePayment(){
        System.out.println("calling make payment of razorpayAPI ");
        razorpayAPI.payment();
    }
}
