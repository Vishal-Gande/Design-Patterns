package Prototype_register.Prototype_RegisterV0;

public class Client {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a4 = new Dog();
        Animal a2; // to create a copy of a1

        //**soln1** - Manually copying attrs
        // copying each attr one-by-one won't work
        // if attrs are private
        //a2.age = a1.age;
        //a2.weight = a1.weight ;
        // Also, if u trying to make a copy of a4
        // a2.breed = a4.breed --> this will throw an error
        //two issues - pvt attrs, and child classes



        //***soln2**** -- using copy constructor

        // works fine in this case
        Animal a3 = new Animal(a1);

        // a4 cud be a dog, cat, etc
        Animal copy_a4;
        if(a4 instanceof Dog){
            copy_a4 = new Dog((Dog) a4); // type casting animal to dog -- this can create problems
        }
        // else if (a4 instanceof Cat){ call constructor of cat}

        // else if ....

        // tomorrow if new class gets created, we will have to
        // modify this code as well ---> violates OCP principle

        // two issues - OCP, typecasting issues
    }
}
