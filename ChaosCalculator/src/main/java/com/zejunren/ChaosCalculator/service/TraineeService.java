package com.zejunren.ChaosCalculator.service;

import com.zejunren.ChaosCalculator.model.Trainee;
import com.zejunren.ChaosCalculator.repository.TraineeRepository;
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
