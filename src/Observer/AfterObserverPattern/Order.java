package Observer.AfterObserverPattern;

public class Order {

    long userID;
    long productID;
    String address;
    long pincode;
    long userMobile;
    String userEmail;

    public Order(long userID, long productID, String address, long pincode, long userMobile, String userEmail) {
        this.userID = userID;
        this.productID = productID;
        this.address = address;
        this.pincode = pincode;
        this.userMobile = userMobile;
        this.userEmail = userEmail;
    }
}