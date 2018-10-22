package org.dutchmen.gametracker.repositories;

import org.dutchmen.gametracker.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
