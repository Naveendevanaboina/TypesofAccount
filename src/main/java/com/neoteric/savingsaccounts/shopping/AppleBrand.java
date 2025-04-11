package com.neoteric.savingsaccounts.shopping;

import java.util.List;

// Multilevel Inheritance: extends MobileBrand → ShoppingMall
import java.util.List;

public class AppleBrand extends MobileBrand {

    private final List<ModelInfo> models = List.of(
            new iPhone14(),
            new iPhone15(),
            new iPhone16()
    );

    private final TaxCalculator taxCalculator = new TaxCalculator();

    // You can switch to CreditCardPayment here
    private final PaymentMethod paymentMethod = new UPIPayment();

    @Override
    protected String getBrandName() {
        return "Apple";
    }

    @Override
    protected void displayModels() {
        System.out.println("Available Apple models:");
        for (ModelInfo model : models) {
            System.out.println("- " + model.getName());
        }
    }

    @Override
    protected void confirmPurchase() {
        ModelInfo selectedModel = models.get(2); // Simulate iPhone 16
        double basePrice = 99999.0;

        System.out.println("Customer bought: " + selectedModel.getName());
        selectedModel.showSpecifications();

        double tax = taxCalculator.calculateTax(basePrice);
        double total = taxCalculator.calculateTotal(basePrice);

        System.out.println("Base Price: ₹" + basePrice);
        System.out.println("Tax (18%): ₹" + tax);
        System.out.println("Total Amount: ₹" + total);

        paymentMethod.makePayment(total);
    }
}
