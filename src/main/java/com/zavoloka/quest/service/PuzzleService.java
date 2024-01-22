package com.zavoloka.quest.service;

import org.springframework.stereotype.Service;

@Service
public class PuzzleService {

    // Add other puzzle-related methods as needed

    public String generatePuzzleForLocation(String location) {
        // Add logic to generate a random puzzle for each location
        // For example:
        if ("forest".equals(location)) {
            return "Solve the riddle of the ancient trees!";
        } else if ("mountains".equals(location)) {
            return "Navigate through the treacherous mountain paths!";
        } else if ("river".equals(location)) {
            return "Cross the river using the stepping stones!";
        } else {
            throw new IllegalArgumentException("Invalid location: " + location);
        }
    }
}
