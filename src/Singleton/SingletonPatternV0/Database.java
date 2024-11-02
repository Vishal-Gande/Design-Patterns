package Singleton.SingletonPatternV0;

public class Database {

    private static Database db_instance = null;

    private Database(){
        // private constructor so that nobody in client can
        // create multiple instances of the class
    }

    // this method must be static for two reasons:
    // 1) it's accessing static variable - getInstance
    // 2) Client creates first instance using class owned method
    public static Database getInstance(){
        if(db_instance == null){
            db_instance = new Database();
        }
        return db_instance;
    }
}
