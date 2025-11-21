package com.zejunren.ChaosCalculator.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "MonsterCard")
public class MonsterCard {
    @Id
    private String monsterCardGuid;

    private String name;
    private List<String> effect;
    private String description;

    public MonsterCard() {}
    public MonsterCard(String monsterCardGuid, String name, List<String> effect, String description) {
        this.monsterCardGuid = monsterCardGuid;
        this.name = name;
        this.effect = effect;
        this.description = description;
    }

    public String getMonsterCardGuid() {
        return monsterCardGuid;
    }

    public void setMonsterCardGuid(String monsterCardGuid) {
        this.monsterCardGuid = monsterCardGuid;
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
