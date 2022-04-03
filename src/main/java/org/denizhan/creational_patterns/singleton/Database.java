package org.denizhan.creational_patterns.singleton;

public class Database {
    public static Database database = null;

    private Database() {
    }

    public static synchronized Database getDatabase() {
        if(database == null){
            database = new Database();
        }
        return database;
    }
}
