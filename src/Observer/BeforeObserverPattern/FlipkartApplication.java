package Observer.BeforeObserverPattern;

public class FlipkartApplication {

    EmailSMSService emailSMSService;
    MobileSMSservice mobileSMSService ;
    CourierPartner courierPartner;
    Invoice invoice;

    FlipkartApplication(EmailSMSService emailSMSService,
                        MobileSMSservice mobileSMSService,
                        CourierPartner courierPartner,
                        Invoice invoice
                        ) {

        this.emailSMSService = emailSMSService;
        this.mobileSMSService = mobileSMSService;
        this.courierPartner = courierPartner;
        this.invoice = invoice;

    }

    public void onOrderPlaced(Order order)
    {
        this.emailSMSService.sendEmail(order);
        this.mobileSMSService.sendMobileSMS(order);
        this.courierPartner.notifyCourierpartner(order);
        this.invoice.generateInvoice(order);
    }
}
