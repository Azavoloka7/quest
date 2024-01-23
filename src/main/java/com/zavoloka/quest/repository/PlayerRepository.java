package com.zavoloka.quest.repository;

import com.zavoloka.quest.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing Player entities.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    // You can add custom query methods if needed
}
