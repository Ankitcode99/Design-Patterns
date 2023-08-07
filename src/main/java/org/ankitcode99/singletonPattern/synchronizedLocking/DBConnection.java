package org.ankitcode99.singletonPattern.synchronizedLocking;

import org.ankitcode99.singletonPattern.lazyInitialization.DatabaseConnection;

public class DBConnection {
    private static DBConnection INSTANCE;

    private DBConnection() {}

    synchronized public static DBConnection getINSTANCE() {
        if(INSTANCE==null){
            INSTANCE = new DBConnection();
        }
        return INSTANCE;
    }
}
