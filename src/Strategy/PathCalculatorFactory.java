package Strategy;

// practical design pattern to select the correct one
public class PathCalculatorFactory {

    public PathCalculator createPathclass(String TransportMode){
        switch (TransportMode){
            case "bike": return new BikePathCalculator();
            case "car": return new CarPathCalculator();
            case "public" : return new PublicTransportPathCalculator();
            default: return null;
        }
    }
}
