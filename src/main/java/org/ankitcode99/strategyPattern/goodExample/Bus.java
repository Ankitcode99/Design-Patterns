package org.ankitcode99.strategyPattern.goodExample;

import org.ankitcode99.strategyPattern.goodExample.driveStrategy.NormalDrive;

public class Bus extends Vehicle{

    public Bus(){
        super(new NormalDrive());
    }
}
