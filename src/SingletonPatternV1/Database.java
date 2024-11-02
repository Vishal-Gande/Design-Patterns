package SingletonPatternV1;

public class Database {

    private static Database database_instance = null ;
    private Database() {


    }

    // synchronized ensures that only one thread enters Critical section at once
    // solving for concurrency issues present in V0
    public synchronized static Database getInstance() {

        if(database_instance == null) {
                database_instance = new Database();
        }
        return database_instance;
    }
}

