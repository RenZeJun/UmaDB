package com.zejunren.ChaosCalculator.repository;

import com.zejunren.ChaosCalculator.model.SupportCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportCardRepository extends MongoRepository<SupportCard, String> {
}
