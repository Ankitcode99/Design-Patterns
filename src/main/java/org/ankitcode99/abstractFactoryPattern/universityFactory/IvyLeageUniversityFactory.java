package org.ankitcode99.abstractFactoryPattern.universityFactory;

import org.example.abstractFactoryPattern.collegeIdFactory.CollegeIdGenerator;
import org.example.abstractFactoryPattern.collegeIdFactory.ivyLeague.HarvardCollegeIdGenerator;
import org.example.abstractFactoryPattern.collegeIdFactory.ivyLeague.MITCollegeIdGenerator;
import org.example.abstractFactoryPattern.collegeIdFactory.ivyLeague.StanfordCollegeIdGenerator;

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
