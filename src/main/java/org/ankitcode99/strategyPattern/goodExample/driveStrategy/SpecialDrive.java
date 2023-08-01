package org.ankitcode99.strategyPattern.goodExample.driveStrategy;

import org.ankitcode99.strategyPattern.goodExample.driveStrategy.DriveMode;

public class SpecialDrive implements DriveMode {
    @Override
    public void drive() {
        System.out.println("SPECIAL DRIVE mode enabled");
    }
}
