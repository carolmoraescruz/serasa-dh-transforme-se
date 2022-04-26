CREATE DATABASE cmc_school;
USE cmc_school;

CREATE TABLE estudante (
    estudante_id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(60) NOT NULL,
    periodo VARCHAR(10) NOT NULL,
    data_matricula DATE,
    PRIMARY KEY (estudante_id)
);

/* os códigos abaixo foram gerados automaticamente pelo workbench - criei a tabela
   usando o programa e não a linha de comando */

/* Criando a tabela telefone */   
CREATE TABLE `cmc_school`.`telefone` (
  `telefone_id` INT NOT NULL AUTO_INCREMENT,
  `ddd` VARCHAR(3) NOT NULL,
  `numero` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`telefone_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_swedish_ci;

/* Alterando a tabela para conectar com a tabela de estudante por estudante_id */
ALTER TABLE `cmc_school`.`telefone` 
ADD COLUMN `fk_estudante_id` INT NULL AFTER `numero`,
ADD INDEX `fk_estudante_id_idx` (`fk_estudante_id` ASC) VISIBLE;
;
ALTER TABLE `cmc_school`.`telefone` 
ADD CONSTRAINT `fk_estudante_id`
  FOREIGN KEY (`fk_estudante_id`)
  REFERENCES `cmc_school`.`estudante` (`estudante_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;


