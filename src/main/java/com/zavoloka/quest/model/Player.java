package com.zavoloka.quest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Represents a player in the game.
 * Each player has a unique identifier, a username, and various game-related attributes.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "player")
public class Player {

    /**
     * Unique identifier for the player.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The current puzzle assigned to the player.
     */
    @Column(length = 255) // Adjust the length as needed
    private String puzzle;

    /**
     * The username of the player.
     */
    @Column(nullable = false, unique = true)
    private String username;

    /**
     * The score accumulated by the player.
     */
    @Column
    private int score;

    /**
     * The current location where the player is situated in the game world.
     */
    @Column(name = "current_location", length = 255) // Adjust the length as needed
    private String currentLocation;

    /**
     * The number of challenges completed by the player.
     */
    @Column(name = "challenges_completed")
    private int challengesCompleted;

    /**
     * The number of puzzles solved by the player.
     */
    @Column(name = "puzzles_solved")
    private int puzzlesSolved;

    // Constructors, getters, and setters...
}
