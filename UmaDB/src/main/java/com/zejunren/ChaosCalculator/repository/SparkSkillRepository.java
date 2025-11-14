package com.zejunren.ChaosCalculator.repository;

import com.zejunren.ChaosCalculator.model.SparkSkill;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SparkSkillRepository extends MongoRepository<SparkSkill, String> {
}
