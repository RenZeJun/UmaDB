package com.zejunren.ChaosCalculator.service;

import com.zejunren.ChaosCalculator.model.Combatant;
import com.zejunren.ChaosCalculator.repository.CombatantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CombatantService {

    private final CombatantRepository combatantRepository;

    public CombatantService(CombatantRepository combatantRepository) {
        this.combatantRepository = combatantRepository;
    }

    public Combatant saveCombatant(Combatant combatant) {
        return combatantRepository.save(combatant);
    }

    public Optional<Combatant> getCombatantById(String id) {
        return combatantRepository.findById(id);
    }

    public List<Combatant> getAllCombatants() {
        return combatantRepository.findAll();
    }

}
