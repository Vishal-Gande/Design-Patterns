package Flyweight;

public class Client {

    public static void main(String[] args) {

        Bullet bullet = CODApplication.loadEnv("ingram"); // loads game here with all bullets etc

        FlyingBullet flyingbullet = new FlyingBullet(2.3, 2.7, 1.2, "east", bullet);
        // add similar code for hundred other bullets

    }
}
