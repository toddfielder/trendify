CREATE TABLE `trendsetter`.`category` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(50) NOT NULL UNIQUE,
  `description` VARCHAR(150) NOT NULL,
  `createdDate` DATETIME NOT NULL,
  `createdBy` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE `trendsetter`.`topic` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `categoryId` INT NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `description` VARCHAR(150),
  `createdDate` DATETIME NOT NULL,
  `createdBy` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (categoryId) REFERENCES category(id));
  
CREATE TABLE `trendsetter`.`comment` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `topicId` INT NOT NULL,
  `text` VARCHAR(150) NOT NULL,
  `createdDate` DATETIME NOT NULL,
  `createdBy` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (topicId) REFERENCES topic(id));