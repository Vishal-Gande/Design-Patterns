package Decorator;

public class ChocolateTopping implements IcecreamCone{

    public ChocolateTopping(Icecream icecream) {
        this.getPrice(icecream);
        this.getDescription(icecream);
    }


    public int getPrice(Icecream icecream) {
        return icecream.cost + 5;
    }

    public String getDescription(Icecream icecream) {
        return icecream.description + " Chocolate topping";
    }
}
