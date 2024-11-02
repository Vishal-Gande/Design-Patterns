package Prototype_register.Prototype_RegisterV0;

public class Animal {

    private int age;
    private String name;
    private double weight;

    public Animal(){}

    // copy constructor
    public Animal(Animal a){
        this.age = a.age;
        this.name = a.name;
        this.weight = a.weight;
    }
}
