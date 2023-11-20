package org.ankitcode99.adapterPattern;

import lombok.Getter;
import lombok.Setter;

public class Receipt {

    @Getter @Setter
    String billNumber;

    @Getter @Setter
    double billAmount;

    @Setter
    BillType billType;

    @Getter @Setter
    String hospital;

    public Receipt(String billNumber, double billAmount, BillType billType, String hospital){
        this.billNumber = billNumber;
        this.billType = billType;
        this.billAmount = billAmount;
        this.hospital = hospital;
    }

    public BillType getBillType() {
        return this.billType;
    }

    public double getBillAmount() {
        return this.billAmount;
    }

    public String getHospital() {
        return this.hospital;
    }
}
