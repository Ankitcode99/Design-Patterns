package org.ankitcode99.strategyPattern.goodExample;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Vehicle sportsCar = new SportsCar();
        Vehicle atv = new ATV();
        Vehicle bus = new Bus();

        atv.drive();
        sportsCar.drive();
        bus.drive();
    }
}