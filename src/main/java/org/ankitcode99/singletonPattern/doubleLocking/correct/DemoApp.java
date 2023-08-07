package org.ankitcode99.singletonPattern.doubleLocking.correct;

public class DemoApp {
    public static void main(String[] args) {
        Runnable task = () -> {
            DBConnection db = DBConnection.getInstance();
            System.out.println("DB Instance created with name - "+db.toString());
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
/***
 * The above implementation is ensuring there is no Instruction Reordering as well as L1 cache sync issue.
 */
