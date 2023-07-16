package org.ankitcode99.observerPattern.observable;

import org.example.observerPattern.observer.ObserverInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ObservableImplementation implements ObservableInterface{

    HashMap<Item, List<ObserverInterface>> listeners = new HashMap<Item, List<ObserverInterface>>();

    public ObservableImplementation(Item... items){
        for(Item item: items){
            listeners.put(item, new ArrayList<>());
        }
    }


    @Override
    public void subscribe(Item item, ObserverInterface observerInterface) {
        List<ObserverInterface> observerInterfaces = listeners.get(item);
        observerInterfaces.add(observerInterface);
    }

    @Override
    public void unsubscribe(Item item, ObserverInterface observerInterface) {
        List<ObserverInterface> observerInterfaces = listeners.get(item);
        observerInterfaces.remove(observerInterface);
    }

    @Override
    public void notifySubscribers(Item item) {
        List<ObserverInterface> observerInterfaceList = listeners.get(item);
        for(ObserverInterface observerInterface: observerInterfaceList){
            observerInterface.update();
        }
    }

    @Override
    public void setData(Item item, int quantity) {
        if(item.getQty()==0){
            notifySubscribers(item);
        }
        int newQuantity = item.getQty() + quantity;
        item.setQty(newQuantity);
    }
}
