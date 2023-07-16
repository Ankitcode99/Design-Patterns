package org.ankitcode99.strategyPattern.goodExample.driveStrategy;

import org.example.strategyPattern.goodExample.driveStrategy.DriveMode;

public class HuvDrive implements DriveMode {
    @Override
    public void drive() {
        System.out.println("HuvDrive mode enabled");
    }
}
