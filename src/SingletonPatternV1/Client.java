package SingletonPatternV1;

import SingletonPatternV0.Database;

public class Client {

    public static void main(String[] args) {

        //Database db_connection_0 = new Database(); Won't work as constructor is private
        SingletonPatternV0.Database db_connection_1 = SingletonPatternV0.Database.getInstance();
        SingletonPatternV0.Database db_connection_2 = Database.getInstance();

        System.out.println(db_connection_1);
        System.out.println(db_connection_2);

        System.out.println(db_connection_1.hashCode());
        System.out.println(db_connection_2.hashCode());
    }
}

/*
Output:
SingletonPatternV0.Database@6acbcfc0
SingletonPatternV0.Database@6acbcfc0
1791741888
1791741888
 */

