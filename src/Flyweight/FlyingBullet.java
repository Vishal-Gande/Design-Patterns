package Flyweight;

public class FlyingBullet {
    private double coordinateX;
    private double coordinateY;
    private double coordinateZ;
    private String direction ;
    private Bullet bullet;

    FlyingBullet(double coordinateX, double coordinateY, double coordinateZ, String direction, Bullet bullet) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
        this.direction = direction;
        this.bullet = bullet; // this reference variable takes hardly 4 bytes, but stores 2kb data
    }

}
