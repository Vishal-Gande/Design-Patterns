package Singleton.SingletonPatternFinal;

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
