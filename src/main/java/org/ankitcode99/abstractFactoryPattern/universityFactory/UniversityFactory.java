package org.ankitcode99.abstractFactoryPattern.universityFactory;

import org.example.abstractFactoryPattern.collegeIdFactory.CollegeIdGenerator;

public abstract class UniversityFactory {

    public abstract CollegeIdGenerator getCollegeIdGenerator(String course);

    private static final int CUTOFF = 120;
    public static UniversityFactory getUniversityFactory(int score){
        if (score > CUTOFF){
            return new IvyLeageUniversityFactory();
        }else{
            return new PublicUniversityFactory();
        }
    }

}
