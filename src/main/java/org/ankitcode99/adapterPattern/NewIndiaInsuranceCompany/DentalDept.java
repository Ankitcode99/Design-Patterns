package org.ankitcode99.adapterPattern.NewIndiaInsuranceCompany;

import org.ankitcode99.adapterPattern.BillType;
import org.ankitcode99.adapterPattern.Receipt;

import java.util.*;

/***
 * The dental dept reimburses pharmacy bill but consultation bill is only returned when the hospital is one of the following
 * 1. Max Hospital
 * 2. Manipal Hospital
 * 3. Leelavati Hospital
 * 4. AIIMS
 */
public class DentalDept implements NewIndiaInsurance{

    Set<String> coveredHospitals ;

    public DentalDept(){
        String[] s = {"Max", "Manipal", "Leelavati", "AIIMS"};
        coveredHospitals=new HashSet<>(List.of(s));
    }
    @Override
    public double computeReimbursableAmount(Receipt... receipts) {
        double totalAmount=0;
        for(Receipt currentReceipt: receipts){
            if(currentReceipt.getBillType().equals(BillType.PHARMACY)){
                totalAmount += currentReceipt.getBillAmount();
            }else if(currentReceipt.getBillType().equals(BillType.CONSULTATION)){
                if(!coveredHospitals.contains(currentReceipt.getHospital())){
                    System.out.println(currentReceipt.getHospital()+" is not covered under Dental consultation reimbursement");
                    continue;
                }
                totalAmount += currentReceipt.getBillAmount();
            }
        }

        return totalAmount;
    }
}
