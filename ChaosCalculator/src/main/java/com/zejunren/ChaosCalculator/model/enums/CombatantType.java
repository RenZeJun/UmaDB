package com.zejunren.ChaosCalculator.model.enums;

public enum CombatantType {
    PASSION("Passion"),
    VOID("Void"),
    INSTINCT("Instinct"),
    ORDER("Order"),
    JUSTICE("Justice");

    private final String label;

    CombatantType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
