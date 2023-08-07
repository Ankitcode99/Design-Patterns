package org.ankitcode99.singletonPattern.doubleLocking.faulty;

import lombok.Getter;

public class DBConnection {
    private static DBConnection instance;

    private DBConnection() {}

    public static DBConnection getInstance(){
        if(instance==null){
            synchronized (DBConnection.class){
                if(instance==null){
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
}
/***
 * In the above implementation of Singleton Pattern in case multiple threads parallely come the first if-check
 * only one of them will be able to go inside the synchronized block and if the instance is still null
 * the entered thread will create the object, now when the other thread(s) come they will fail the second if-check
 * and return the same instance created by the first entered thread.
 */