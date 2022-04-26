CREATE DATABASE `loja`;
USE loja;

CREATE TABLE CLIENTE (
	CPF varchar (11) NOT NULL,
	NOME varchar (40) NOT NULL,
	CIDADE varchar (30) NOT NULL,
	UF varchar (2) NOT NULL,
	primary key (CPF));

select * from CLIENTE;
