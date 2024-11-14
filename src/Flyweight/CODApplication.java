package Flyweight;

public class CODApplication {

    public static Bullet loadEnv(String bulletType)
    {
        Bullet ingramBullet = new Bullet(6,"grey","Put image here", 12.6, 26, 2.4);
        Bullet shotgunBullet = new Bullet(7,"black","Put image here", 25.2, 18, 5.4);
        // add other bullets

        switch (bulletType){
            case "ingram": return ingramBullet;
            case "shotgun": return shotgunBullet;
            default: return null;
        }


    }
}
