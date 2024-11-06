package Adapter;

public class CurefitApplication {

    public static void main(String[] args) {

        PaymentGW paymentGW = new RazorpayAdapter();

        // PaymentGW paymentGW = new PayUAdapter();
        // if at all razorpay goes down someday. just one line change


        paymentGW.makePayment();
        paymentGW.generate_OTP();
        paymentGW.qr_code_generator();

    }

}
