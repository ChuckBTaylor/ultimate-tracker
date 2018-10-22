package org.dutchmen.gametracker.controllers;

import java.util.List;

import org.dutchmen.gametracker.models.Team;
import org.dutchmen.gametracker.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/teams")
public class TeamsController {

	@Autowired
	private TeamRepository teamRepositoty;

	@GetMapping
	public ResponseEntity<List<Team>> getTeams() {
		List<Team> teams = teamRepositoty.findAll();
		return new ResponseEntity<>(teams, HttpStatus.OK);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createTeam(@RequestBody Team team) {
		teamRepositoty.save(team);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Team> getTeam(@PathVariable("id") long id) {
		Team team = teamRepositoty.getOne(id);
		return new ResponseEntity<Team>(team, HttpStatus.OK);
	}

}
