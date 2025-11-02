package com.zejunren.UmaDB.service;

import com.zejunren.UmaDB.model.G1Race;
import com.zejunren.UmaDB.repository.G1RaceRepository;
import org.springframework.stereotype.Service;

@Service
public class G1RaceService {
    private final G1RaceRepository g1RaceRepository;

    public G1RaceService(G1RaceRepository g1RaceRepository) {this.g1RaceRepository = g1RaceRepository;}

    public G1Race createG1Race(G1Race g1Race) {
        g1RaceRepository.save(g1Race);
        return g1Race;
    }
}
