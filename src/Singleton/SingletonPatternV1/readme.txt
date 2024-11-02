This is V1 version of singleton pattern

How's it better than V0?

Works in multithreaded env as well, as only one thread enters
critical section now.

Issues?

Even after one instance is created, multiple threads wait to get db_instance,
as only one thread is allowed in CS.
This results in drop in performance.

Let's solve that in final version