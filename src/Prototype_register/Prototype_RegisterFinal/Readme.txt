Copy constructors approach
Issue we had with previous approach of using copy constructors was that we had to first determine
the actual object type(Animal or Dog or Cat) by using if-else and then call respective constructors respectively.
If we were to introduce a new subclass tomorrow(say pig), we will have to make changes in Client code - add another
else statement. ---> Violates OCP, as we're modifying the already existing code


So, main issue was --> Identifying which constructor to call!!

How are we solving for this in Final Approach?
Answer : Method overriding!

Parent class will have a method copy() --> All it does it call the constructor(with Animal arg)
All subclasses MUST override(have a method) this copy() calling their own constructors(with Dog arg)

Example:

Animal a = new Dog(include args);
Animal copy_a = a.copy();

how does line 19 work?
a.copy() will call Dog's copy method, due to runtime method overriding.
Dog.copy() will further call Dog constructor
which will further call Animal constructor

So, without using any if-else to identify if 'a' is dog/cat etc, we're able to clone the variable.

Also, tomorrow if new class pig is added... nothing changes.. just call p.copy() to clone Pig object
OCP is SOLVED !!

