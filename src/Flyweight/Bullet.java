package Flyweight;

// all intrinsic properties, which won't change are stored here
public class Bullet {
    private int weight; //4Bytes
    private String color; // 20 Bytes
    private String image ; // 2KB this takes majority of space
    private double damage;
    private int speed;
    private double radius;

    public Bullet(int weight, String color, String image, double damage, int speed, double radius) {
        this.weight = weight;
        this.color = color;
        this.image = image;
        this.damage = damage;
        this.speed = speed;
        this.radius = radius;
    }
}
