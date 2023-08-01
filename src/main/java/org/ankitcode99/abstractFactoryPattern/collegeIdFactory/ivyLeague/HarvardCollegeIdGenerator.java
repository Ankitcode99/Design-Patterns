package org.ankitcode99.abstractFactoryPattern.collegeIdFactory.ivyLeague;

import org.ankitcode99.abstractFactoryPattern.collegeIdFactory.CollegeIdGenerator;

public class HarvardCollegeIdGenerator implements CollegeIdGenerator {
    @Override
    public String generateCollegeId(String course) {
        return "HARVARD_"+course+"_"+(int)Math.floor(Math.random()*1000);
    }
}
