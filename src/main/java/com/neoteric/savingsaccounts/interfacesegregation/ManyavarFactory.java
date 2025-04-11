package com.neoteric.savingsaccounts.interfacesegregation;

public class ManyavarFactory implements OutfitFactory {
    @Override
    public Fabric createFabric() {
        return new CottonFabric();
    }

    @Override
    public Style createStyle() {
        return new CasualStyle();
    }
}