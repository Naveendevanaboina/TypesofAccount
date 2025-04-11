package com.neoteric.savingsaccounts.shopping;

public abstract class MobileBrand extends ShoppingMall{


     void selectBrand() {
        System.out.println(getBrandName() + " brand selected.");
    }

    // Each brand will define this
     abstract String getBrandName();
}

