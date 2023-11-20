package org.ankitcode99.adapterPattern.NewIndiaInsuranceCompany;

import org.ankitcode99.adapterPattern.BillType;
import org.ankitcode99.adapterPattern.Receipt;

/**
 * The ortho-dept  reimburses both pharmacy and consultation
 * */
public class OrthoDept implements NewIndiaInsurance{
    @Override
    public double computeReimbursableAmount(Receipt... receipts) {
        double totalAmount=0;
        for(Receipt currentReceipt: receipts){
            if(currentReceipt.getBillType().equals(BillType.PHARMACY) ||
                    currentReceipt.getBillType().equals(BillType.CONSULTATION)){
                totalAmount += currentReceipt.getBillAmount();
            }else{
                continue;
            }
        }

        return totalAmount;
    }
}
