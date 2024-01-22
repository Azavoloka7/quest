package com.zavoloka.quest.controller;

import com.zavoloka.quest.model.Player;
import com.zavoloka.quest.repository.PlayerRepository;
import com.zavoloka.quest.service.PuzzleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PuzzleService puzzleService;

    // ... (other methods)

    @PostMapping("/{id}/explore/{location}")
    public Player exploreLocation(@PathVariable Long id, @PathVariable String location) {
        Player player = getPlayerById(id);

        // Check if the location is available for exploration
        if ("forest".equals(location) || "mountains".equals(location) || "river".equals(location)) {
            // Set the current location for the player
            player.setCurrentLocation(location);

            // Generate a random puzzle for the location
            String puzzle = puzzleService.generatePuzzleForLocation(location);
            player.setPuzzle(puzzle);

            // Increase the player's score by 10 for exploring the location
            player.setScore(player.getScore() + 10);

            return playerRepository.save(player);
        } else {
            throw new IllegalArgumentException("Invalid location: " + location);
        }
    }

    private Player getPlayerById(Long id) {
        return playerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Player not found with id: " + id));
    }

    // ... (other methods)
}
