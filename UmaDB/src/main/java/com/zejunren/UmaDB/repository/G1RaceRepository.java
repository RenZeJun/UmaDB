package com.zejunren.UmaDB.repository;

import com.zejunren.UmaDB.model.G1Race;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface G1RaceRepository extends MongoRepository<G1Race, String> {

    List<G1Race> findByName(String name);

    List<G1Race> findByDate(Date date);

    List<G1Race> findBySparksContaining(String Spark);
}
