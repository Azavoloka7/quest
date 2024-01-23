package com.zavoloka.quest.service;

/**
 * A service interface for generating puzzles.
 */
public interface PuzzleGenerator {

    String generatePuzzle();

    /**
     * Generates a puzzle for the specified location.
     *
     * @param location The location for which the puzzle should be generated.
     * @return The generated puzzle.
     */
    String generatePuzzleForLocation(String location);

    /**
     * Gets a default puzzle. Implementations can use this as a fallback.
     *
     * @return The default puzzle.
     */
    default String getDefaultPuzzle() {
        return "This is a default puzzle!";
    }
}
