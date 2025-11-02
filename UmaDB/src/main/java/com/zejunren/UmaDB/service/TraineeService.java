package com.zejunren.UmaDB.service;

import com.zejunren.UmaDB.model.Trainee;
import com.zejunren.UmaDB.repository.TraineeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraineeService {
    private final TraineeRepository repository;

    public TraineeService(TraineeRepository repository) {
        this.repository = repository;
    }

    public List<Trainee> getAllTrainees() {
        return repository.findAll();
    }

    public Trainee createTrainee(Trainee trainee) {
        repository.save(trainee);
        return trainee;
    }



}
