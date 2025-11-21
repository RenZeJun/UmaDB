package com.zejunren.ChaosCalculator.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "NeutralCard")
public class NeutralCard {
    @Id
    private String NeutralCardGuid;

    private String name;
    private List<String> effect;
    private String description;

    public NeutralCard() {}
    public NeutralCard(String neutralCardGuid, String name, List<String> effect, String description) {
        NeutralCardGuid = neutralCardGuid;
        this.name = name;
        this.effect = effect;
        this.description = description;
    }

    public String getNeutralCardGuid() {
        return NeutralCardGuid;
    }

    public void setNeutralCardGuid(String neutralCardGuid) {
        NeutralCardGuid = neutralCardGuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getEffect() {
        return effect;
    }

    public void setEffect(List<String> effect) {
        this.effect = effect;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
