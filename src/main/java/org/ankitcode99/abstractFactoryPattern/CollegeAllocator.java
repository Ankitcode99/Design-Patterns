package org.ankitcode99.abstractFactoryPattern;

import org.ankitcode99.abstractFactoryPattern.collegeIdFactory.CollegeIdGenerator;
import org.ankitcode99.abstractFactoryPattern.universityFactory.UniversityFactory;

public class CollegeAllocator {
    public static void main(String[] args) {

        int score = 180;
        UniversityFactory universityFactory = UniversityFactory.getUniversityFactory(score);
        CollegeIdGenerator collegeIdGenerator = universityFactory.getCollegeIdGenerator("Math");
        System.out.println(collegeIdGenerator.generateCollegeId("Math"));

        score = 100;
        universityFactory = UniversityFactory.getUniversityFactory(score);
        collegeIdGenerator = universityFactory.getCollegeIdGenerator("CS");
        System.out.println(collegeIdGenerator.generateCollegeId("CS"));
    }
}
