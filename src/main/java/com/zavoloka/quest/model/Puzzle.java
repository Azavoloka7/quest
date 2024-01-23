package com.zavoloka.quest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "puzzle")
public class Puzzle {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String description;

    // Constructors, getters, and setters...

    // Additional methods:

    /**
     * Constructor to create a puzzle with only a description.
     * @param description The description of the puzzle.
     */
    public Puzzle(String description) {
        this.description = description;
    }

    /*
     * Method to set the description of the puzzle.
     * @param description The new description of the puzzle.
     */

    // You can add more methods based on the requirements of your application.
}