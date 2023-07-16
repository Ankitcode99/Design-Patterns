package org.ankitcode99.abstractFactoryPattern.universityFactory;

import org.example.abstractFactoryPattern.collegeIdFactory.CollegeIdGenerator;
import org.example.abstractFactoryPattern.collegeIdFactory.publicUniversity.SanDiegoCollegeIdGenerator;
import org.example.abstractFactoryPattern.collegeIdFactory.publicUniversity.TexasCollegeIdGenerator;
import org.example.abstractFactoryPattern.collegeIdFactory.publicUniversity.UCLACollegeIdGenerator;

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
