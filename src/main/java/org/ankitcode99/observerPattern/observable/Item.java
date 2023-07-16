package org.ankitcode99.observerPattern.observable;

import lombok.Getter;

public class Item {
    private String name;
    @Getter
    private int qty;

    public Item(String name,int qty){
        this.name = name;
        this.qty = qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public int getQty(){
        return this.qty;
    }
}
