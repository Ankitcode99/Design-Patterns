package org.ankitcode99.singletonPattern.doubleLocking.faulty;

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
 * The above method is a good way to create singleton object but there are 2 bugs when using it in production.
 *
 * 1. Instruction reordering - Suppose while creating the object we also initialize one instance variable, CPU
 * will try to internally optimise the set of instructions involving (i) creation of object's pointer, (ii) initialize instance variable
 * and then (iii) assigning the reference to the pointer to our `instance` variable. Suppose cpu reorders the instructions in
 * (i)->(iii)->(ii) order, now if one thread has only completed step (i) & (iii) and an other thread performs the first if-check
 * the second thread will get the default value of member variable, not the one provided during object creation.
 *
 * 2. L1 Caching issue - https://www.youtube.com/watch?v=upfrQvOgC24&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=33&t=545s
 *
 * So to fix these issues we just make the `instance` variable volatile - ensuring there is no Instruction Reordering
 * as well as L1 cache sync issue.
 */
