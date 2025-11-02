package com.zejunren.UmaDB.repository;

import com.zejunren.UmaDB.model.Trainee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TraineeRepository extends MongoRepository<Trainee, String> {

    List<Trainee> findByName(String name);

}
