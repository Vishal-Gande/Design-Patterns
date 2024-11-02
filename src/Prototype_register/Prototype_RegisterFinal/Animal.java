package Prototype_register.Prototype_RegisterFinal;

public class Animal {

    private String name;
    private int age;

    public Animal(Animal animal) {
        this.name = animal.name;
        this.age = animal.age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal copy() {
        return new Animal(this);
    }
}
