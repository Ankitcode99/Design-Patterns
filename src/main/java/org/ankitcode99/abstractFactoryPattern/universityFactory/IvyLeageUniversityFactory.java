package org.ankitcode99.abstractFactoryPattern.universityFactory;

import org.ankitcode99.abstractFactoryPattern.collegeIdFactory.CollegeIdGenerator;
import org.ankitcode99.abstractFactoryPattern.collegeIdFactory.ivyLeague.HarvardCollegeIdGenerator;
import org.ankitcode99.abstractFactoryPattern.collegeIdFactory.ivyLeague.MITCollegeIdGenerator;
import org.ankitcode99.abstractFactoryPattern.collegeIdFactory.ivyLeague.StanfordCollegeIdGenerator;

public class IvyLeageUniversityFactory extends UniversityFactory {
    @Override
    public CollegeIdGenerator getCollegeIdGenerator(String course) {
        switch (course){
            case "Math":
                return new MITCollegeIdGenerator();
            case "CS":
                return new StanfordCollegeIdGenerator();
            case "Physics":
                return new HarvardCollegeIdGenerator();
            default: return null;
        }
    }
}
