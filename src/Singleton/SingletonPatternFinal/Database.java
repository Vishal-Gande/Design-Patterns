package Singleton.SingletonPatternFinal;

class Database {

    private static Database database_instance = null ;
    private Database() {}

    public static Database getInstance() {

        if(database_instance == null) {
            // this solves for performance issues, as threads don't
            // anymore wait, after first instance is created
            synchronized(Database.class) {
                if(database_instance == null) {
                    database_instance = new Database();
                }
            }
        }
        return database_instance;
    }
}
