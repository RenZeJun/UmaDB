package com.zejunren.ChaosCalculator.model;

import com.zejunren.ChaosCalculator.model.enums.CombatantType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Combatant")
public class Combatant {
    @Id
    private String CombatantsGuid;

    private CombatantType type;
    private String name;
    private List<Card> cards;

    public Combatant() {}
    public Combatant(String combatantsGuid, String name, List<Card> cards, CombatantType type) {
        CombatantsGuid = combatantsGuid;
        this.type = type;
        this.name = name;
        this.cards = cards;
    }

    public String getCombatantsGuid() {
        return CombatantsGuid;
    }

    public void setCombatantsGuid(String combatantsGuid) {
        CombatantsGuid = combatantsGuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public CombatantType getType() {
        return type;
    }

    public void setType(CombatantType type) {
        this.type = type;
    }
}
