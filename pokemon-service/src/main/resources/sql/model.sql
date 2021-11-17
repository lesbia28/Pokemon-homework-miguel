
DROP SCHEMA IF EXISTS pokemon_service;
CREATE SCHEMA pokemon_service;
GRANT ALL PRIVILEGES ON pokemon_service.* TO 'ironhacker'@'localhost';

USE pokemon_service;

DROP TABLE IF EXISTS teams;
DROP TABLE IF EXISTS team_members;
DROP TABLE IF EXISTS trainers;

CREATE TABLE trainers
 (id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255),
  age int,
  city VARCHAR(255),
  hobby VARCHAR(255),
  picture VARCHAR(255),
  PRIMARY KEY (id));

INSERT INTO trainers
(name, age, city, hobby, picture)
VALUES
("Alejandro", 29, "Madrid", "Listen music",
"https://www.seekpng.com/png/detail/242-2421423_pokemon-trainer-sprite-png-pixel-pokemon-trainer-sprites.png"),
("Luis", 31, "Madrid", "Listen music",
"https://www.seekpng.com/png/detail/242-2421423_pokemon-trainer-sprite-png-pixel-pokemon-trainer-sprites.png"),
("Libertad", 27, "Madrid", "Listen music",
"https://www.seekpng.com/png/detail/242-2421423_pokemon-trainer-sprite-png-pixel-pokemon-trainer-sprites.png"),
("Alicia", 31, "Madrid", "Listen music",
"https://www.seekpng.com/png/detail/242-2421423_pokemon-trainer-sprite-png-pixel-pokemon-trainer-sprites.png"),
("Lu", 31, "Madrid", "Listen music",
"https://www.seekpng.com/png/detail/242-2421423_pokemon-trainer-sprite-png-pixel-pokemon-trainer-sprites.png")
;

CREATE TABLE team_members
 (id BIGINT NOT NULL,
  name VARCHAR(255),
  PRIMARY KEY (id));

INSERT INTO team_members
(id, name)
VALUES
(1,"Bulbasaur"),
(2,"Ivysaur"),
(3,"Venusaur"),
(4,"Charmander"),
(5,"Charmeleon"),
(6,"Charizard"),
(7,"Squirtle"),
(8,"Wartortle"),
(9,"Blastoise"),
(25,"Pikachu")
;

CREATE TABLE teams
 (id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255),
  trainer_id BIGINT,
  team_member_id BIGINT,
  PRIMARY KEY (id),
  FOREIGN KEY (trainer_id) REFERENCES trainers (id),
  FOREIGN KEY (team_member_id) REFERENCES team_members (id));

INSERT INTO teams
(name, trainer_id, team_member_id)
VALUES
("Alejandros-team",1,25),
("Alejandros-team",1,4),
("Luis-team",2,7),
("Luis-team",2,25),
("Libertads-team",3,25),
("Libertads-team",3,6),
("Alicias-team",4,25),
("Alicias-team",4,2),
("Lus-team",5,25),
("Lus-team",5,8);