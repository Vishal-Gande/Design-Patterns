package SingletonPatternV0;

public class Client {

    public static void main(String[] args) {


        //Database db_connection_0 = new Database(); Won't work as constructor is private
        Database db_connection_1 = Database.getInstance();
        Database db_connection_2 = Database.getInstance();

        System.out.println(db_connection_1);
        System.out.println(db_connection_2);

        System.out.println(db_connection_1.hashCode());
        System.out.println(db_connection_2.hashCode());

    }
}

/*
Output:
SingletonPatternV0.Database@6be46e8f
SingletonPatternV0.Database@6be46e8f
1810132623
1810132623

This depicts that both are same instances
 */
