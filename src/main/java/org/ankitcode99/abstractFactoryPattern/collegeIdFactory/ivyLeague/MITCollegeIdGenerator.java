package org.ankitcode99.abstractFactoryPattern.collegeIdFactory.ivyLeague;

import org.example.abstractFactoryPattern.collegeIdFactory.CollegeIdGenerator;

public class MITCollegeIdGenerator implements CollegeIdGenerator {
    @Override
    public String generateCollegeId(String course) {
        return "MIT_"+course+"_"+(int)Math.floor(Math.random()*1000);
    }
}
