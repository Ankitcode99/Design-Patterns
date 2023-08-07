package org.ankitcode99.singletonPattern.synchronizedLocking;

public class AppDemo {
    public static void main(String[] args) {
        Runnable task = () -> {
            DBConnection  db = DBConnection.getINSTANCE();
            System.out.println("DB Instance Created with name - "+db.toString());
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
/***
 * Using synchronized getInstance method ensures when multiple threads call the method only
 * 1 thread is allowed to take the lock and go inside the function to create the
 * instance(in-case it's not created yet) while the other threads wait for thread-1 to release the lock.
 * This method is good but very costly since acquiring lock and releasing lock is an expensive process hence
 * it's avoided in the industry.
 */