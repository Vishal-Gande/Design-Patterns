package Adapter;

public class PayUAPI {

    public void scanner_display(){
        System.out.println("displayed QR scanner -- PayU");
    }

    public void complete_payment(){
        System.out.println("completed payment complete -- PayU");
    }

    // notice that method signature is quite different from our paymentGW otp
    public void otp(String deviceType)
    {
        if(deviceType.equals("mobile"))
        {
            System.out.println("generate mobile otp complete -- PayU");
        }

        else System.out.println("generate email otp");
    }
}
