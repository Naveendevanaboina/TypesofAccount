package com.neoteric.savingsaccounts.shopping;


public abstract class ShoppingMall {


      void sellProduct() {
          welcomeCustomer();
        selectBrand();
        displayModels();
        confirmPurchase();
        giveWarranty();
    }
    private void welcomeCustomer() {
        System.out.println("Welcome to the Shopping Mall!");
    }
    // Steps to be implemented by subclasses (e.g., AppleBrand)
     abstract void selectBrand();
     abstract void displayModels();
     abstract void confirmPurchase();

    // Common logic across all brands
    public void giveWarranty() {
        System.out.println("Warranty card issued.\n");
    }
}
