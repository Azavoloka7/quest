package com.zavoloka.quest.controller;

import com.zavoloka.quest.model.Puzzle;
import com.zavoloka.quest.service.PuzzleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/puzzles")
public class PuzzleController {

    @Autowired
    private PuzzleService puzzleService;

    @GetMapping
    public List<Puzzle> getAllPuzzles() {
        // Implement logic to get all puzzles from the database
        // For simplicity, let's return an empty list for now
        return List.of();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Puzzle> getPuzzleById(@PathVariable Long id) {
        // Implement logic to get a puzzle by ID from the database
        // For simplicity, let's return a not found response for now
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Puzzle> createPuzzle(@RequestBody Puzzle puzzle) {
        // Implement logic to create a puzzle and save it to the database
        // For simplicity, let's return the created puzzle for now
        return ResponseEntity.ok(puzzle);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Puzzle> updatePuzzle(@PathVariable Long id, @RequestBody Puzzle puzzle) {
        // Implement logic to update a puzzle by ID in the database
        // For simplicity, let's return the updated puzzle for now
        return ResponseEntity.ok(puzzle);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePuzzle(@PathVariable Long id) {
        // Implement logic to delete a puzzle by ID from the database
        // For simplicity, let's return no content for now
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/generateRandom")
    public ResponseEntity<Puzzle> generateRandomPuzzle() {
        // Implement logic to generate a random puzzle
        // For simplicity, let's use the service to generate a puzzle
        String randomPuzzleDescription = puzzleService.generatePuzzle();
        Puzzle randomPuzzle = new Puzzle();
        randomPuzzle.setDescription(randomPuzzleDescription);
        return ResponseEntity.ok(randomPuzzle);
    }
}
