DROP DATABASE if EXISTS receta; 
CREATE DATABASE recipe;

use recipe;

CREATE TABLE recipes (
  id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
  name_recipe VARCHAR(50)NOT NULL UNIQUE,
  ingredients TEXT NOT NULL,
  score SMALLINT NOT NULL,
  last_update TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


