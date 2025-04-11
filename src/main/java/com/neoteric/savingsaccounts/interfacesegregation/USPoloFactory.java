package com.neoteric.savingsaccounts.interfacesegregation;

public class USPoloFactory implements  OutfitFactory {

    @Override
    public Fabric createFabric() {
        return new PiqueFabric();
    }

    @Override
    public Style createStyle() {
        return new SportyStyle();
    }
}

