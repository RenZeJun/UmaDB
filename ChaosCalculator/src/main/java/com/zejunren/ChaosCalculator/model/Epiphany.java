package com.zejunren.ChaosCalculator.model;

import java.util.List;

public class Epiphany {

    private int epiphanyNumber;
    private int cost;

    private List<String> traits;
    private List<String> effects;

    public Epiphany() {}
    public Epiphany(int epiphanyNumber, int cost, List<String> traits, List<String> effects) {
        this.epiphanyNumber = epiphanyNumber;
        this.cost = cost;
        this.traits = traits;
        this.effects = effects;
    }

    public int getEpiphanyNumber() {
        return epiphanyNumber;
    }

    public void setEpiphanyNumber(int epiphanyNumber) {
        this.epiphanyNumber = epiphanyNumber;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public List<String> getTraits() {
        return traits;
    }

    public void setTraits(List<String> traits) {
        this.traits = traits;
    }

    public List<String> getEffects() {
        return effects;
    }

    public void setEffects(List<String> effects) {
        this.effects = effects;
    }
}
