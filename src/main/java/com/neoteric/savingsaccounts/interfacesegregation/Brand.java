package com.neoteric.savingsaccounts.interfacesegregation;

public class Brand extends ShoppingMall {
    private String brandName;
    private OutfitFactory factory;

    public Brand(String brandName, OutfitFactory factory) {
        this.brandName = brandName;
        this.factory = factory;
    }

    public void chooseBrand() {
        System.out.println("🛍️  You selected brand: " + brandName);
    }

    public void showOutfit() {
        System.out.println("\n✨ Assembling Your US Polo Shirt from " + brandName + "...");
        Fabric fabric = factory.createFabric();
        Style style = factory.createStyle();
        fabric.selectFabric();
        style.designStyle();
        System.out.println("✅ Outfit Ready! Looking awesome 😎");
    }
}