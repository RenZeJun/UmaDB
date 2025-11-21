package com.zejunren.ChaosCalculator.controller;

import com.zejunren.ChaosCalculator.model.Combatant;
import com.zejunren.ChaosCalculator.service.CombatantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/combatants")
public class CombatantController {

    @Autowired
    private CombatantService service;

    @PostMapping
    public Combatant createCombatant(@RequestBody Combatant combatant) {
        return service.saveCombatant(combatant);
    }

    @GetMapping("/{id}")
    public Combatant getCombatant(@PathVariable String id) {
        return service.getCombatantById(id).orElse(null);
    }


}
