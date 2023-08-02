package org.ankitcode99.builderPattern.improvedImplementation;

public class Driver {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("512","16")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(false)
                .build();
    }
}
