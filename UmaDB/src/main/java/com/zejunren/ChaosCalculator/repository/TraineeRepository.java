package com.zejunren.ChaosCalculator.repository;

import com.zejunren.ChaosCalculator.model.Trainee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TraineeRepository extends MongoRepository<Trainee, String> {

    List<Trainee> findByName(String name);

}
