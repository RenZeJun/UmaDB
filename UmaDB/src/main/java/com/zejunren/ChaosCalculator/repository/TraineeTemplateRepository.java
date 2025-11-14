package com.zejunren.ChaosCalculator.repository;

import com.zejunren.ChaosCalculator.model.TraineeTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraineeTemplateRepository extends MongoRepository<TraineeTemplate, String> {

}
