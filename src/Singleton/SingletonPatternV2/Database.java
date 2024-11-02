package Singleton.SingletonPatternV2;

public class Database {

    private static Database database_instance = new Database() ;
    private Database() {}

    public static Database getInstance() {

        return database_instance;
    }
}

