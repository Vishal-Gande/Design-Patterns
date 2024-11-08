package Observer.BeforeObserverPattern;

public class Client {

    public static void main(String[] args) {

        EmailSMSService emailSMSService = new EmailSMSService();
        MobileSMSservice mobileSMSService = new MobileSMSservice();
        CourierPartner courierPartner = new CourierPartner();
        Invoice invoice = new Invoice();

        FlipkartApplication flipkart = new FlipkartApplication(emailSMSService, mobileSMSService, courierPartner, invoice);

        Order order = new Order();
        //populate order details with address userID productID etc ...

        flipkart.onOrderPlaced(order);

    }

}
