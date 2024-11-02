package SingletonPatternV2;

public class Database {

    public static Database database_instance = new Database() ;
    private Database() {

    }

    public static Database getInstance() {

        return database_instance;
    }
}

