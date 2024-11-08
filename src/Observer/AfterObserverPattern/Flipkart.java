package Observer.AfterObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {

    private List<OrderPlacedObserver> orderPlacedObservers = new ArrayList<>();

    public void addOrderPlacedObserver(OrderPlacedObserver orderPlacedObserver) {
        this.orderPlacedObservers.add(orderPlacedObserver);
    }

    public void removeOrderPlacedObserver(OrderPlacedObserver orderPlacedObserver) {
        this.orderPlacedObservers.remove(orderPlacedObserver);
    }


    public void onOrderPlaced(Order order){

        for(OrderPlacedObserver opo : orderPlacedObservers)
        {
            opo.onOrderPlaced(order);
        }
    }

}
