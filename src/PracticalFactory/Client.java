package PracticalFactory;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        // let's say u r playing angry birds game and u(client) selects his
        // bird by giving input word.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Bird: ");
        String birdType = scanner.nextLine();

        Bird b = BirdFactory.createBird(birdType);
        b.fly(); // Crow flying if input is crow
    }
}
