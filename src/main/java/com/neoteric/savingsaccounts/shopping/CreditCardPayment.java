package com.neoteric.savingsaccounts.shopping;

public class CreditCardPayment extends PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made via Credit Card.");
    }
}
