package com.zavoloka.quest.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class PuzzleService {
    private static final String DEFAULT_LOCATION = "unknown";
    private final Random random = new Random();

    private final List<String> forestPuzzles = List.of(
            "Solve the riddle of the ancient trees!",
            "Find the hidden treasure beneath the leaves!"
    );

    private final List<String> mountainsPuzzles = List.of(
            "Navigate through the treacherous mountain paths!",
            "Conquer the summit and unveil the secret cave!"
    );

    private final List<String> riverPuzzles = List.of(
            "Cross the river using the stepping stones!",
            "Discover the underwater realm beneath the river's surface!"
    );

    public String generatePuzzle() {
        // Generate a random puzzle without specifying a location
        return getRandomElement(List.of(
                "Solve the mystery puzzle!",
                "Unravel the enigma hidden in the shadows!",
                "Decode the secret message to proceed!"
        ));
    }

    public String generatePuzzleForLocation(String location) {
        switch (location) {
            case "forest":
                return generateForestPuzzle();
            case "mountains":
                return generateMountainsPuzzle();
            case "river":
                return generateRiverPuzzle();
            default:
                throw new IllegalArgumentException("Invalid location: " + location);
        }
    }

    private String generateForestPuzzle() {
        return getRandomElement(forestPuzzles);
    }

    private String generateMountainsPuzzle() {
        return getRandomElement(mountainsPuzzles);
    }

    private String generateRiverPuzzle() {
        return getRandomElement(riverPuzzles);
    }

    private String getRandomElement(List<String> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Empty puzzle list");
        }
        return list.get(random.nextInt(list.size()));
    }
}
