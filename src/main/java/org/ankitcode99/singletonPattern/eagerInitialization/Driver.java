package org.ankitcode99.singletonPattern.eagerInitialization;


public class Driver {
    public static void main(String[] args) {
        Runnable task = () -> {
            DatabaseConnection db = DatabaseConnection.getInstance();

            System.out.println("DB Instance Created with name - " + db.toString());
        };


        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
//        DatabaseConnection db = DatabaseConnection.getInstance();
//
//        System.out.println("DB Instance Created with name - " + db.toString());
    }
}
/**
 * This method involves creation of object during class loading hence during the code execution
 * irrespective of the number of threads this method created only one single object.
 * This is the best method in-cases where the object being created consumes less memory.
 */