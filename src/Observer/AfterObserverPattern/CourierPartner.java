package Observer.AfterObserverPattern;

public class CourierPartner implements OrderPlacedObserver {

    // this is the tricky part of observer design pattern
    public CourierPartner(Flipkart flipkart) {
        flipkart.addOrderPlacedObserver(this);
    }

    public void pickupOrder(Order order) {
        System.out.println("Picking up order for userID " + order.userID + " and delivering to address: " + order.address);
    }
    public void onOrderPlaced(Order order) {
        this.pickupOrder(order);
    }
}
