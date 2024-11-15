package Decorator;

public class VanillaScoop implements IcecreamCone{

    public VanillaScoop(Icecream icecream) {
        this.getPrice(icecream);
        this.getDescription(icecream);
    }

    public int getPrice(Icecream icecream) {
        return icecream.cost + 40;
    }

    public String getDescription(Icecream icecream) {
        return icecream.description + " + Vanilla Scoop";
    }
}
