package Prototype_register.Prototype_RegisterFinal;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Dog(Dog dog) {
        super(dog); // Note : Dog is a type of Animal --> so it calls Animal constr with Animal arg
        this.breed = dog.breed;
    }

    public Dog copy(){
        return new Dog(this); // this first calls dog constr w dog arg,
                              // which further calls Animal constr with Animal arg

    }
}
