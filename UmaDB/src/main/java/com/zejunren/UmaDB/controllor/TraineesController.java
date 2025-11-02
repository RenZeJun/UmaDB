package com.zejunren.UmaDB.controllor;

import com.zejunren.UmaDB.model.Trainee;
import com.zejunren.UmaDB.repository.TraineeRepository;
import com.zejunren.UmaDB.service.TraineeService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/trainee")
public class TraineesController {
    private final TraineeService service;

    private final TraineeRepository repo;

    public TraineesController(TraineeService service, TraineeRepository repo) {
        this.service = service;
        this.repo = repo;
    }

    @PostMapping
    public void createTrainee(@RequestBody Trainee trainee) {

        Trainee saved = service.createTrainee(trainee);

        System.out.println("Generated ID: " + saved.getGUID());
    }

    @GetMapping("/{id}")
    public Optional<Trainee> getTrainee(@PathVariable String id) {
        return repo.findById(id);
    }

}
