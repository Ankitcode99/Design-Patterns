package org.ankitcode99.strategyPattern.goodExample;

import org.ankitcode99.strategyPattern.goodExample.driveStrategy.SpecialDrive;

public class SportsCar extends Vehicle{
    public SportsCar(){
        super(new SpecialDrive());
    }
}
