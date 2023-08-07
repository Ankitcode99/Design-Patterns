package org.ankitcode99.singletonPattern.lazyInitialization;

public class DatabaseConnection {
    public static DatabaseConnection instance = null;

    private DatabaseConnection(){}

    public static DatabaseConnection getInstance() {
        if(instance==null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
