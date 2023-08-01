package org.ankitcode99.adapterPattern.Adapter;

import org.ankitcode99.adapterPattern.Receipt;

public interface Medibuddy {
    public double getReimbursementAmount(Receipt... receipts);
}
