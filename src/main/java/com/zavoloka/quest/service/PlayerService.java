package com.zavoloka.quest.service;

import com.zavoloka.quest.model.Player;
import com.zavoloka.quest.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService( PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public void performPlayerOperations() {
        // Save a new player
        Player player = new Player();
        // Set player properties
        playerRepository.save(player);

        // Find a player by ID
        Long playerId = 1L;
        Player foundPlayer = playerRepository.findById(playerId).orElse(null);

        // Delete a player
        playerRepository.deleteById(playerId);
    }
}
