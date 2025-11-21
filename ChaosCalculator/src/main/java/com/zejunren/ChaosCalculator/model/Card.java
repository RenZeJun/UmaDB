package com.zejunren.ChaosCalculator.model;

import com.zejunren.ChaosCalculator.model.enums.CardType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


public class Card {
    private String cardsGuid;

    private String name;
    private CardType type;
    private Integer cost;

    private List<String> traits;
    private List<String> effects;
    private List<Epiphany> epiphanies;
    private String divineEpiphanie;

    public Card() {}
    public Card(String cardsGuid, String name, CardType type, Integer cost, List<String> traits, List<String> effects, List<Epiphany> epiphanies, String divineEpiphanie) {
        this.cardsGuid = cardsGuid;
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.traits = traits;
        this.effects = effects;
        this.epiphanies = epiphanies;
        this.divineEpiphanie = divineEpiphanie;
    }

    public String getCardsGuid() {
        return cardsGuid;
    }

    public void setCardsGuid(String cardsGuid) {
        this.cardsGuid = cardsGuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
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

    public List<Epiphany> getEpiphanies() {
        return epiphanies;
    }

    public void setEpiphanies(List<Epiphany> epiphanies) {
        this.epiphanies = epiphanies;
    }

    public String getDivineEpiphanie() {
        return divineEpiphanie;
    }

    public void setDivineEpiphanie(String divineEpiphanie) {
        this.divineEpiphanie = divineEpiphanie;
    }
}
