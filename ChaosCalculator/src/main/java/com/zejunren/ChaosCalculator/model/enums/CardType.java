package com.zejunren.ChaosCalculator.model.enums;

public enum CardType {
    ATTACK("Attack"),
    SKILL("Skill"),
    UPGRADE("Upgrade");

    private final String label;

    CardType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
