package com.zavoloka.quest.service;

import java.util.List;
import java.util.Random;

public class RandomPuzzleGenerator implements PuzzleGenerator {
    private final Random random = new Random();
    private final List<String> puzzles = List.of(
            "Puzzle 1",
            "Puzzle 2",
            "Puzzle 3"
    );

    @Override
    public String generatePuzzle() {
        if (puzzles.isEmpty()) {
            throw new IllegalArgumentException("Empty puzzle list");
        }
        return puzzles.get(random.nextInt(puzzles.size()));
    }

    @Override
    public String generatePuzzleForLocation( String location ) {
        return null;
    }
}
