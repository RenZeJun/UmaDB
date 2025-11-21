package com.zejunren.ChaosCalculator.repository;

import com.zejunren.ChaosCalculator.model.Combatant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CombatantRepository extends MongoRepository<Combatant, String> {

    List<Combatant> findByName(String name);

}
