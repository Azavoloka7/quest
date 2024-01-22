package com.zavoloka.quest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String puzzle;

    @Column
    private String username;

    @Column
    private int score;

    @Column(name = "current_location")
    private String currentLocation;

    @Column(name = "challenges_completed")
    private int challengesCompleted;

    @Column(name = "puzzles_solved")
    private int puzzlesSolved;

    // Constructors, getters, and setters...
}
