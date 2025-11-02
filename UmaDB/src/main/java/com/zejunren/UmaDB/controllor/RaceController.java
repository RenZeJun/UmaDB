package com.zejunren.UmaDB.controllor;

import com.zejunren.UmaDB.model.G1Race;
import com.zejunren.UmaDB.model.Trainee;
import com.zejunren.UmaDB.repository.G1RaceRepository;
import com.zejunren.UmaDB.service.G1RaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/races")
@CrossOrigin(origins = "http://localhost:5173")
public class RaceController {
    private final G1RaceService g1RaceService;
    private final G1RaceRepository g1RaceRepository;

    public RaceController(G1RaceService g1RaceService, G1RaceRepository g1RaceRepository) {
        this.g1RaceService = g1RaceService;
        this.g1RaceRepository = g1RaceRepository;
    }

    @PostMapping
    public void CreateG1RaceController(@RequestBody G1Race g1Race){
        G1Race saved = g1RaceService.createG1Race(g1Race);
        System.out.println(saved.getGUID());
    }

    @GetMapping("/{GUID}")
    public Optional<G1Race> getG1Race(@PathVariable String GUID) {
        return g1RaceRepository.findById(GUID);
    }

    @GetMapping("/allRaces")
    public List<G1Race> getAllRaces() {
        System.out.println("hit");
        return g1RaceRepository.findAll();
    }

}
