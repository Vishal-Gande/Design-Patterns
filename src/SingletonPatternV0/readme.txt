This is V0 version of singleton pattern

What does it solve?

It ensures that only one instance of database
connection is created from client class.

How does it solve?

a) Private constructor ensures client doesn't create multiple
instances of the database class

b) getInstance method is called from client using a class.getInstance
It ensures only one instance is created.


Issues?

a) Concurrency issues in case of multithreading
    t1 and t2 might check "db_instance == null" condition at the same time,
    and end up creating two instances

Let's resolve these issues in upcoming versions! Lessgoo!