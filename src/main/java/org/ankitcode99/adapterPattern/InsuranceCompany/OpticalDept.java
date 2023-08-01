package org.ankitcode99.adapterPattern.InsuranceCompany;

import org.ankitcode99.adapterPattern.BillType;
import org.ankitcode99.adapterPattern.Receipt;

/***
 * The optical dept reimburses only pharmacy bill
 *
 */
public class OpticalDept implements NewIndiaInsurance{
    @Override
    public double computeReimbursableAmount(Receipt... receipts) {
        double totalAmount=0;
        for(Receipt currentReceipt: receipts){
            if(currentReceipt.getBillType().equals(BillType.PHARMACY)){
                totalAmount += currentReceipt.getBillAmount();
            }else{
                System.out.println("Only PHARMACY bills are covered under Optical Reimbursements");
            }
        }

        return totalAmount;
    }
}
