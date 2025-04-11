package com.neoteric.savingsaccounts.shopping;

public class UPIPayment extends PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made via UPI.");
    }
}
