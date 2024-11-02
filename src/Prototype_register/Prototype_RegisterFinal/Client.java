package Prototype_register.Prototype_RegisterFinal;

public class Client {

    public static void main(String[] args) {

        Animal a = new Animal("Snoopy", 7);

        Animal copy_a = a.copy();
        System.out.println(copy_a);

        Animal b = new Dog("bowbow", 7 , "german Shepherd");
        Animal copy_b = b.copy();
        System.out.println(copy_b);

    }
}
