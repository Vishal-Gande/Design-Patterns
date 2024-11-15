package Decorator;

public class OrangeCone implements IcecreamCone{


    public OrangeCone(Icecream icecream) {
        this.getPrice(icecream);
        this.getDescription(icecream);
    }

    public int getPrice(Icecream icecream) {
        return icecream.cost + 20;
    }

    public String getDescription(Icecream icecream) {
        return icecream.description + "Orange Cone";
    }
}
