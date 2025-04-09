package com.neoteric.savingsaccounts.account;

import java.time.LocalDate;

public  abstract class Account {
    protected String accountNumber;
    protected String accountType;
    protected double balanceAmount;
    private  String nominee;

    public String getNominee() {
        return nominee;
    }

    public void setNominee(String nominee) {
        this.nominee = nominee;
    }

    public Account(String nominee) {
        this.nominee = nominee;
    }

    public Account(String accountNumber, String accountType, double balanceAmount) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balanceAmount = balanceAmount;
    }

    public double calculateInterest() {
        return getInterestRate();
    }

    public LocalDate getMaturityDate() {
        return LocalDate.now().plusMonths(getMaturityMonths());
    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : ₹" + balanceAmount);
        System.out.println("Nominee        : " + (nominee != null ? nominee : "Not Assigned"));
    }

    protected abstract double getInterestRate();
    protected abstract int getMaturityMonths();
}
