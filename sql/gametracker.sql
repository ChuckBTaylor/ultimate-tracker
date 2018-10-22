CREATE TABLE
 team (
   ID BIGINT NOT NULL,
   name VARCHAR,
   location VARCHAR,
   PRIMARY KEY (ID)
 );

CREATE TABLE
 hibernate_sequence_team (
   next_val BIGINT
 );

INSERT INTO team (ID, name, location) VALUES (1, "Dutchmen", "Hempstead, NY");
 INSERT INTO hibernate_sequence_team (next_val) VALUES (1);

CREATE TABLE
 player
  (
    ID BIGINT NOT NULL,
    first_name VARCHAR,
    last_name VARCHAR,
    team_id BIGINT NULL,
    FOREIGN KEY (team_id) REFERENCES team(ID)
  );
 INSERT INTO player (ID, first_name, last_name) VALUES (1, "Squeak", "Moore");

 CREATE TABLE
 hibernate_sequence_player (
   next_val BIGINT
 );

INSERT INTO hibernate_sequence_player (next_val) VALUES (1);