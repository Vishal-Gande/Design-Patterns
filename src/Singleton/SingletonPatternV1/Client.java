package Singleton.SingletonPatternV1;


class Client {

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
SingletonPattern.SingletonPatternV1.Database@6acbcfc0
SingletonPattern.SingletonPatternV1.Database@6acbcfc0
1791741888
1791741888
 */

