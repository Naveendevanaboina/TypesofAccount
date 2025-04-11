package com.neoteric.savingsaccounts.shopping;

public class TaxCalculator {
    private static final double TAX_RATE = 0.18;

    public double calculateTax(double price) {
        return price * TAX_RATE;
    }

    public double calculateTotal(double price) {
        return price + calculateTax(price);
    }
}
