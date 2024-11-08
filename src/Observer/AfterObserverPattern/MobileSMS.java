package Observer.AfterObserverPattern;


public class MobileSMS implements OrderPlacedObserver {

    // this is the tricky part of observer design pattern
    public MobileSMS(Flipkart flipkart) {
        flipkart.addOrderPlacedObserver(this);
    }

    public void sendSMS(Order order) {
        System.out.println("sending sms with order details to mobile number: " + order.userMobile);
    }

    public void onOrderPlaced(Order order) {
        this.sendSMS(order);
    }
}
