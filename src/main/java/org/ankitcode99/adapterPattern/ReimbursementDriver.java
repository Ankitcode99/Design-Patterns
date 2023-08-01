package org.ankitcode99.adapterPattern;

import org.ankitcode99.adapterPattern.Adapter.Medibuddy;
import org.ankitcode99.adapterPattern.Adapter.MedibuddyImplementation;
import org.ankitcode99.adapterPattern.InsuranceCompany.DentalDept;
import org.ankitcode99.adapterPattern.InsuranceCompany.OpticalDept;

public class ReimbursementDriver {
    public static void main(String[] args) {
        Medibuddy medibuddy1 = new MedibuddyImplementation(new OpticalDept());

        Receipt receiptOptical1 = new Receipt("1131131", 450.10, BillType.CONSULTATION, "Sarojini Naidu IMS");
        Receipt receiptOptical2 = new Receipt("1212121", 3500, BillType.PHARMACY, "Sarojini Naidu IMS");

        printReimbursedAmount(medibuddy1.getReimbursementAmount(receiptOptical2, receiptOptical1));

        Medibuddy medibuddy2 = new MedibuddyImplementation(new DentalDept());

        Receipt receiptDental1 = new Receipt("141414", 250, BillType.PHARMACY, "Max");
        Receipt receiptDental2 = new Receipt("1515151", 360, BillType.PHARMACY, "AIIMS");
        Receipt receiptDental3 = new Receipt("878787", 150, BillType.CONSULTATION, "AIIMS");
        Receipt receiptDental4 = new Receipt("79977", 1000, BillType.CONSULTATION, "Sarojini Naidu IMS");

        printReimbursedAmount(medibuddy2.getReimbursementAmount(receiptDental1, receiptDental2, receiptDental3, receiptDental4));
    }

    private static void printReimbursedAmount(double reimbursementAmount) {
        System.out.println("You are eligible for a reimbursement of INR. "+reimbursementAmount);
        System.out.println("\n\n==============================================================\n\n");
    }
}
