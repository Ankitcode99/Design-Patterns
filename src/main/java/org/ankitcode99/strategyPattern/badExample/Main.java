package org.ankitcode99.strategyPattern.badExample;

/**
 * Here both sportsCar and atv object have the same implementation of the drive method thus introducing duplicate code
 * @author AnkitCode99
 */

public class Main {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        Bus bus = new Bus();
        ATV atv = new ATV();

        sportsCar.drive();
        bus.drive();
        atv.drive();
    }
}
