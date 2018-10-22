package org.dutchmen.gametracker.controllers;

import java.util.List;

import org.dutchmen.gametracker.models.Player;
import org.dutchmen.gametracker.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/players")
public class PlayersController {

	@Autowired
	private PlayerRepository playerRepo;

	@GetMapping
	public ResponseEntity<List<Player>> getPlayers() {
		List<Player> players = playerRepo.findAll();
		return new ResponseEntity<List<Player>>(players, HttpStatus.OK);
	}

}
