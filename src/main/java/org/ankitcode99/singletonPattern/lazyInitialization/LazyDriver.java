package org.ankitcode99.singletonPattern.lazyInitialization;


public class LazyDriver {
    public static void main(String[] args) {
        Runnable task = () -> {
            DatabaseConnection db = DatabaseConnection.getInstance();

            System.out.println("DB Instance Created with name - " + db.toString());
        };


        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }

}
/***
 * The problem with lazy initialization is when 2 threads try to call the getInstance method
 * simultaneously they will paralelly check the null condition but them doing so will result in creation
 * of 2 DatabaseConnection objects thus violating the single pattern
 */