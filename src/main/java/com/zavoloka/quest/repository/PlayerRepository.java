package com.zavoloka.quest.repository;

import com.zavoloka.quest.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
