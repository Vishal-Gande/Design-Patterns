package Observer.AfterObserverPattern;


public class InventoryManager implements OrderPlacedObserver {

    // this is the tricky part of observer design pattern
    public InventoryManager(Flipkart flipkart) {
        flipkart.addOrderPlacedObserver(this);
    }
    public void dispatchOrder(Order order) {
        System.out.println("Getting product " + order.productID + " ready for dispatch for userID " + order.userID);
    }
    public void onOrderPlaced(Order order) {
        this.dispatchOrder(order);
    }
}
