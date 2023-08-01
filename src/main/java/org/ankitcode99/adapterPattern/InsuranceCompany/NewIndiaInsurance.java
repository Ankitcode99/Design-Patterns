package org.ankitcode99.adapterPattern.InsuranceCompany;

import org.ankitcode99.adapterPattern.Receipt;

public interface NewIndiaInsurance {
    public double computeReimbursableAmount(Receipt... receipts);
}
