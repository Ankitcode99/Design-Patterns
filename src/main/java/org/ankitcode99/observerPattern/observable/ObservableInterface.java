package org.ankitcode99.observerPattern.observable;

import org.ankitcode99.observerPattern.observer.ObserverInterface;

public interface ObservableInterface {
    public void subscribe(Item item, ObserverInterface observerInterface);

    public void unsubscribe(Item item, ObserverInterface observerInterface);

    public void notifySubscribers(Item item);

    public void setData(Item item, int quantity);
}
