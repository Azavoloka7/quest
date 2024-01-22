package com.zavoloka.quest.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class PuzzleService {
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

    public String generatePuzzleForLocation(String location) {
        switch (location) {
            case "forest":
                return getRandomElement(forestPuzzles);
            case "mountains":
                return getRandomElement(mountainsPuzzles);
            case "river":
                return getRandomElement(riverPuzzles);
            default:
                throw new IllegalArgumentException("Invalid location: " + location);
        }
    }

    private String getRandomElement(List<String> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Empty puzzle list");
        }
        return list.get(random.nextInt(list.size()));
    }
}
