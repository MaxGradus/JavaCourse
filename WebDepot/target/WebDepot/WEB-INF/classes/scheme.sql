SET FOREIGN_KEY_CHECKS=0;


CREATE DATABASE `web_depot_db`
CHARACTER SET 'utf8'
COLLATE 'utf8_general_ci';

CREATE TABLE web_depot_db.users
(
  userId INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  login VARCHAR(64) NOT NULL,
  password VARCHAR(64) NOT NULL,
  email VARCHAR(64) NOT NULL,
  role VARCHAR(15) NOT NULL
);

CREATE TABLE web_depot_db.placements
(
  placeId INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  placeName VARCHAR(64) NOT NULL,
  price INT NOT NULL,
  date BIGINT
);

CREATE TABLE `users_places` (
  `userId` int(11) NOT NULL,
  `placeId` int(11) NOT NULL,
  PRIMARY KEY (`userId`,`placeId`),
  KEY `fk_users_places_1_idx` (`userId`),
  KEY `fk_users_places_2_idx` (`placeId`),
  CONSTRAINT `fk_users_places_1` FOREIGN KEY (`userId`) REFERENCES `users` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_users_places_2` FOREIGN KEY (`placeId`) REFERENCES `placements` (`placeId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1

# CREATE TABLE web_depot_db.users_places
# (
#   userId INT NOT NULL,
#   placeId INT NOT NULL,
#   KEY `FKADD16E575326420C` (`userId`),
#   KEY `FKADD16E574A2FCC` (`placeId`),
#   CONSTRAINT `FKADD16E574A2FCC` FOREIGN KEY (`userId`) REFERENCES `users` (`userId`),
#   CONSTRAINT `FKADD16E575326420C` FOREIGN KEY (`placeId`) REFERENCES `placements` (`placeId`)
# );

