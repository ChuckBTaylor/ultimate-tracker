package org.dutchmen.gametracker.repositories;

import org.dutchmen.gametracker.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
