package com.zavoloka.quest.service;

public interface PuzzleGenerator {
    String generatePuzzle();

    default String getDefaultPuzzle() {
        return "This is a default puzzle!";
    }
}
