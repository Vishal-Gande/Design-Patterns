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


When should you use this design pattern?

You need instances of freq used objects, u store prototype which has base values set.

Eg1 : You are using google search API.
http_req object a:
path = 'www.google.com/search'
username = 'gande'
password = 'Hehe'
type = 'text search'
query = ""  // this will change for each request. fields above this are fixed base values.

So u create an object of this, and store it as a prototype, and then create new objects as req.
http_req copy1 = a.copy();
copy1.query = "2011 wc final score card"

http_req copy2 = b.copy(); // let's say b is a prototype for image search.
copy2.query = 'some link to an image'


Eg2: Storing class prototype in an academy.
class object a:
name = 'graph theory'
assignment = 'qns 1 2 3'
pre-read = 'link 1'
post-read = 'link 2'
instructor = "" ; // to be set later
batch = "" ; // to be set later

we can use this base prototype to create as many "graph theory" classes as req in future


Eg3 : CoD bullets
bullets registry:
    a) 7.62 bullet prototype:
        size = 7.62
        damage = 2000
        image = 'link to image'
        coordinates = ""; // to be set depending on player

    b) 9mm bullet prototype
        size = 9
        damage = 2000
        .
        .

now use this prototype registry to create a 10000 of different types bullets and assign it to player x.




