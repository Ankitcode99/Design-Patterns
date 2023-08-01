package org.ankitcode99.observerPattern;

import org.ankitcode99.observerPattern.observable.Item;
import org.ankitcode99.observerPattern.observable.ObservableImplementation;
import org.ankitcode99.observerPattern.observer.EmailObserver;
import org.ankitcode99.observerPattern.observer.ObserverInterface;
import org.ankitcode99.observerPattern.observer.SmsObserver;

public class Store {
    public static void main(String[] args) {
        Item banana = new Item("Banana", 0);
        Item apple = new Item("Apple", 5);

        ObservableImplementation observableImplementation = new ObservableImplementation(banana, apple);

        ObserverInterface observer1 = new EmailObserver("observer1@ankitcode99.com");
        ObserverInterface observer2 = new EmailObserver("observer2@ankitcode99.com");
        ObserverInterface observer3 = new SmsObserver("12345");
        ObserverInterface observer4 = new EmailObserver("observer4@ankitcode99.com");
        ObserverInterface observer5 = new SmsObserver("67890");

        observableImplementation.subscribe(banana, observer1);
        observableImplementation.subscribe(banana, observer4);
        observableImplementation.subscribe(apple, observer3);

        observableImplementation.setData(banana, 10);
        observableImplementation.setData(apple, -5);
        observableImplementation.setData(apple, 10);

    }
}
