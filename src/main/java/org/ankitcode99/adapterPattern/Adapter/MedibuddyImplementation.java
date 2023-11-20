package org.ankitcode99.adapterPattern.Adapter;

import org.ankitcode99.adapterPattern.NewIndiaInsuranceCompany.NewIndiaInsurance;
import org.ankitcode99.adapterPattern.Receipt;

public class MedibuddyImplementation implements Medibuddy{

    NewIndiaInsurance newIndiaInsurance;

    public MedibuddyImplementation(NewIndiaInsurance newIndiaInsurance){
        this.newIndiaInsurance = newIndiaInsurance;
    }

    @Override
    public double getReimbursementAmount(Receipt... receipts) {
        return newIndiaInsurance.computeReimbursableAmount(receipts);
    }
}
