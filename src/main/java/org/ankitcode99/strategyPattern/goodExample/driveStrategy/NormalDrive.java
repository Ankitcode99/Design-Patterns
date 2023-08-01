package org.ankitcode99.strategyPattern.goodExample.driveStrategy;

import org.ankitcode99.strategyPattern.goodExample.driveStrategy.DriveMode;

public class NormalDrive implements DriveMode {
    @Override
    public void drive(){
        System.out.println("NORMAL DRIVE mode enabled");
    }
}
