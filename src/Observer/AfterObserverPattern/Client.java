package Observer.AfterObserverPattern;

public class Client {

    public static void main(String[] args) {

        Order order = new Order(23, 6756, "Plot no. 345, Madhura nagar, Hyderabad",
                500045, 270242, "abc@gmail.com");

        Flipkart flipkart = new Flipkart();

        InventoryManager inventoryManager = new InventoryManager(flipkart);
        CourierPartner cp = new CourierPartner(flipkart);
        MobileSMS mobileSMS = new MobileSMS(flipkart);

        flipkart.onOrderPlaced(order);

    }
}
