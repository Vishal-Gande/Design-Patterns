package Strategy;

import java.util.Scanner;

public class GoogleMapsApplicationCode {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter From location: ");
        String from = scanner.nextLine();

        System.out.print("Enter To location: ");
        String to = scanner.nextLine();

        System.out.print("Enter Mode of transport: ");
        String mode = scanner.nextLine();

        // practical factory pattern to create the correct type based on user input
        PathCalculatorFactory pathCalculatorFactory = new PathCalculatorFactory();
        PathCalculator pathcalci = pathCalculatorFactory.createPathclass(mode);

        pathcalci.get_path(from, to);


    }


}
