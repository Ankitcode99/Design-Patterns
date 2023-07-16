package org.ankitcode99.strategyPattern.goodExample;

import org.example.strategyPattern.goodExample.driveStrategy.DriveMode;

public class Vehicle {

    private DriveMode driveObject;

    protected Vehicle(DriveMode driveMode){
        this.driveObject = driveMode;
    }

    public void drive(){
        driveObject.drive();
    }

}
