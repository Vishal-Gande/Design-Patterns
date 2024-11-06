package Adapter;

//payment gateway
public interface PaymentGW {

    public void qr_code_generator();
    public void generate_OTP();
    public void makePayment();
}
