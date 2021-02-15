package com.company;


public class VipCustomer {
    public String VIPName;
    public double creditLimit;
    public String emailAddress;

    public VipCustomer(){
        this("Default Name", 1000, "Default Email");
    }

    public VipCustomer(String VIPName, double creditLimit) {
        this(VIPName,creditLimit,"unknown email");
    }

    public VipCustomer(String VIPName, double creditLimit, String emailAddress) {
        this.VIPName = VIPName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getVIPName() {
        return VIPName;
    }
}
