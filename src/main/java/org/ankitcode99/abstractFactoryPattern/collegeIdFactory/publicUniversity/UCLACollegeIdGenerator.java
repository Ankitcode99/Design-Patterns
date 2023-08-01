package org.ankitcode99.abstractFactoryPattern.collegeIdFactory.publicUniversity;

import org.ankitcode99.abstractFactoryPattern.collegeIdFactory.CollegeIdGenerator;

public class UCLACollegeIdGenerator implements CollegeIdGenerator {
    @Override
    public String generateCollegeId(String course) {
        return "UCLA_"+course+"_"+(int)Math.floor(Math.random()*1000);
    }
}
