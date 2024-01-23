package com.zavoloka.quest.controller;

import com.zavoloka.quest.model.Player;
import com.zavoloka.quest.repository.PlayerRepository;
import com.zavoloka.quest.service.PuzzleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerRepository playerRepository;
    private final PuzzleService puzzleService;

    @Autowired
    public PlayerController(PlayerRepository playerRepository, PuzzleService puzzleService) {
        this.playerRepository = playerRepository;
        this.puzzleService = puzzleService;
    }

    // ... (other methods)

    @PostMapping("/{id}/explore/{location}")
    public ResponseEntity<Player> exploreLocation(@PathVariable Long id, @PathVariable String location) {
        Player player = getPlayerById(id);

        // Check if the location is available for exploration
        if (isValidLocation(location)) {
            // Set the current location for the player
            player.setCurrentLocation(location);

            // Generate a random puzzle for the location
            String puzzle = puzzleService.generatePuzzleForLocation(location);
            player.setPuzzle(puzzle);

            // Increase the player's score by 10 for exploring the location
            player.setScore(player.getScore() + 10);

            Player savedPlayer = playerRepository.save(player);
            return ResponseEntity.ok(savedPlayer);
        } else {
            throw new InvalidLocationException("Invalid location: " + location);
        }
    }

    private boolean isValidLocation(String location) {
        return "forest".equals(location) || "mountains".equals(location) || "river".equals(location);
    }

    private Player getPlayerById(Long id) {
        return playerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Player not found with id: " + id));
    }

    @ExceptionHandler(InvalidLocationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> handleInvalidLocationException(InvalidLocationException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public static class InvalidLocationException extends RuntimeException {
        public InvalidLocationException(String message) {
            super(message);
        }
    }
}
