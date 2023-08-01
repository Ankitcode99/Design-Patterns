package org.ankitcode99.abstractFactoryPattern.universityFactory;

import org.ankitcode99.abstractFactoryPattern.collegeIdFactory.CollegeIdGenerator;
import org.ankitcode99.abstractFactoryPattern.collegeIdFactory.publicUniversity.SanDiegoCollegeIdGenerator;
import org.ankitcode99.abstractFactoryPattern.collegeIdFactory.publicUniversity.TexasCollegeIdGenerator;
import org.ankitcode99.abstractFactoryPattern.collegeIdFactory.publicUniversity.UCLACollegeIdGenerator;

public class PublicUniversityFactory extends UniversityFactory {

    @Override
    public CollegeIdGenerator getCollegeIdGenerator(String course) {
        switch (course){
            case "Math":
                return new UCLACollegeIdGenerator();
            case "CS":
                return new SanDiegoCollegeIdGenerator();
            case "Physics":
                return new TexasCollegeIdGenerator();
            default: return null;
        }
    }
}
