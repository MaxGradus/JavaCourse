SET FOREIGN_KEY_CHECKS=0;


CREATE DATABASE `web_depot_db`
CHARACTER SET 'utf8'
COLLATE 'utf8_general_ci';

CREATE TABLE web_depot_db.users
(
  user_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  login VARCHAR(64) NOT NULL,
  password VARCHAR(64) NOT NULL,
  email VARCHAR(64) NOT NULL,
  role VARCHAR(15) NOT NULL
);

CREATE TABLE web_depot_db.placements
(
  place_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  place_name VARCHAR(64) NOT NULL,
  price INT NOT NULL,
  date BIGINT
);

CREATE TABLE web_depot_db.users_places
(
  user_id INT NOT NULL,
  place_id INT NOT NULL,
  KEY `FKADD16E575326420C` (`user_id`),
  KEY `FKADD16E574A2FCC` (`place_id`),
  CONSTRAINT `FKADD16E574A2FCC` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `FKADD16E575326420C` FOREIGN KEY (`place_id`) REFERENCES `placements` (`place_id`)
);

