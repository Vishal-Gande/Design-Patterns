package FactoryDesignPatterns.PracticalFactory;

public class BirdFactory {

    public static Bird createBird(String birdType){

        switch (birdType){
            case "crow" : return new Crow();
            case "eagle" : return new Eagle();
            case "Sparrow" : return new Sparrow();
            default: return new Bird();
        }
    }
}
