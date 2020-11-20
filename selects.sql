/*SELECT * FROM itau.clientes order by nome_cliente;

select * from itau.clientes where idate_cliente >= 18 and idate_cliente <= 30

select * from itau.clientes where idate_cliente

select count(*) as Total_Cliente from itau.clientes where idate_cliente >= 18 and idate_cliente <= 30

select * from itau.clientes where idate_cliente in (20,30,40);
select count(*) as totar from itau.clientes where idate_cliente in (20,30,40);



SELECT * FROM itau.clientes where nome_cliente like '%sex%';

-- criar campos
alter table itau.clientes add  endereco varchar(60) not null;

-- deletar campos
alter table itau.clientes drop endereco; 
-- renomear campos
alter table itau.clientes rename column endereco to endereco_cliente
alter table itau.clientes rename column idate_cliente to idade_cliente


-- alter table itau.clientes change endereco_cliente endereco_cliente varchar(80) not null

-- update itau.clientes set endereco_cliente = "Rua Tito" where codigo_cliente = 1;
-- update itau.clientes set endereco_cliente = "Atualizar campo endereço" where codigo_cliente > 1;

-- alter table itau.clientes add  estado_cliente char(2) not null;

-- atualizacao de campo especificos
-- update itau.clientes set estado_cliente='SP' where idade_cliente >= 18 and idade_cliente <= 30;
-- update itau.clientes set estado_cliente='XX' where estado_cliente is null;
-- update itau.clientes set estado_cliente='XX' where estado_cliente <> 'SP';

-- create table itau.bck_clientes select * from itau.clientes
-- select * from itau.bck_clientes

-- delete from itau.clientes
insert into itau.clientes
(codigo_cliente,nome_cliente,idade_cliente,email_cliente,endereco_cliente,estado_cliente)
select codigo_cliente,nome_cliente,idade_cliente,email_cliente,endereco_cliente,estado_cliente from itau.bck_clientes


create database unibanco;

use unibanco

create table unibanco.clientes select * from itau.clientes ;

select * from unibanco.clientes

drop table itau.clientes
drop table itau.bck_clientes


create table itau.clientes(
codigo_cliente int not null,
nome_cliente varchar(50) not null,
cpf_cliente char(11) not null,
idade_cliente int(3) not null,
endereco_cliente varchar(80) not null,
bairro_cliente varchar(60) not null,
estado_cliente char(2) not null,
agencia_cliente char(4) not null,
conta_corrente_cliente varchar(8) not null,
digito_verificador_cliente int(1) not null,
telefone_contato_cliente char(11) not null,
email_cliente varchar(80) not null,
data_modificacao_registro_cliente datetime,
primary key (codigo_cliente,cpf_cliente)


insert into  itau.clientes 
(codigo_cliente,nome_cliente,cpf_cliente,idade_cliente,endereco_cliente,bairro_cliente,estado_cliente,agencia_cliente,conta_corrente_cliente,digito_verificador_cliente,telefone_contato_cliente,email_cliente,data_modificacao_registro_cliente)
select codigo_cliente,nome_cliente,"atualizar",idade_cliente,endereco_cliente,"atualizar",estado_cliente,"0000","000000",0,"atualizar",email_cliente,now() from unibanco.clientes;


describe unibanco.clientes
);
create table itau.controle_horas(
cod_controlador int auto_increment,
nome_funcionario varchar(50) not null,
quantidade_horas_trab int(2) not null,
valor_hora decimal(8,2) not null,
primary key (cod_controlador)
);


insert into  itau.controle_horas 
(
nome_funcionario, quantidade_horas_trab, valor_hora
)
values ("SOMEONE COOL", 12,10.50),
	   ("OTHER PERSON", 8,50.50),
	   ("ANOTHER PERSON", 8,8.50),
	   ("SELECT * FROM", 8,50.50)


SELECT nome_funcionario, quantidade_horas_trab, valor_hora,(quantidade_horas_trab*valor_hora) as Vl_sal_dia,genero
from itau.controle_horas

alter table itau.controle_horas add  genero char(1) not null;

update itau.controle_horas set nome_funcionario='Pedro da Silva' where nome_funcionario = 'SOMEONE COOL';
update itau.controle_horas set nome_funcionario='Flamir Silva' where nome_funcionario = 'OTHER PERSON';
update itau.controle_horas set nome_funcionario='Katia Ribeiro' where nome_funcionario = 'ANOTHER PERSON';
update itau.controle_horas set genero='M' where nome_funcionario='Pedro da Silva';

update itau.controle_horas set nome_funcionario='Nicole Bontempo' where nome_funcionario = 'SELECT * FROM';

select genero , sum(quantidade_horas_trab*valor_hora) as Tot_Sal_Dia from itau.controle_horas group by genero order by genero;

SELECT 
    idade_cliente, COUNT(*) AS Total_Clientes
FROM
    itau.clientes
WHERE
    idade_cliente IN (20 , 30, 40)
GROUP BY idade_cliente;


CREATE TABLE `Produtos` (
	`Codigo_Produto` int NOT NULL AUTO_INCREMENT,
	`Nome_Produto` varchar(50) NOT NULL,
	`Valor_Produto` DECIMAL(8,2) NOT NULL,
	`Cod_Marca` int NOT NULL,
	PRIMARY KEY (`Codigo_Produto`)
);

CREATE TABLE `Marcas` (
	`Cod_Marca` int NOT NULL AUTO_INCREMENT,
	`Nome_Marca` varchar(50) NOT NULL,
	PRIMARY KEY (`Cod_Marca`)
);

ALTER TABLE `Produtos` ADD CONSTRAINT `Produtos_fk0` FOREIGN KEY (`Cod_Marca`) REFERENCES `Marcas`(`Cod_Marca`);




insert into itau.produtos (nome_Produto, Valor_Produto,Cod_Marca)
values
("Liquidificador", 89.99, 1),
("Ps5", 5000.99, 3),
("xboz series", 4500.99, 4),
("Polystation", 89.99, 7),
("AiFone", 50.99, 7),
("AIPode", 89.99, 7),
("Fone Bluetooth", 25.99, 7),
("ventilador", 89.99, 2),
("moedor", 89.99, 1),
("canos", 15.99, 6),
("cd office", 10.99, 7),
("Fogao", 89.99, 1),
("Liquidificador", 89.99, 7)




insert into  itau.marcas 
(Nome_Marca)
values
("marca 1"),
("marca 2"),
("marca 3"),
("marca 4"),
("marca 5"),
("marca 6"),
("marca 7")

select p.nome_produto, p.valor_produto, m.nome_marca from itau.produtos as p, itau.marcas as m
where p.cod_marca = m.cod_marca 




create table itau.cargo(
	cod_cargo char(2) not null,
    nome_cargo varchar(50) not null,
    valor_cargo decimal (8,2) not null,
    primary key(cod_cargo)
)



create table itau.funcionario(
matricula int not null auto_increment,
nome_funcionario  varchar(50) not null,
cod_cargo char(2) not null,
primary key (matricula),
foreign key(cod_cargo) references cargo(cod_cargo)


)

insert into itau.cargo(cod_cargo,nome_cargo,valor_cargo)
values
("C1" ,"Analista de sistemas" ,5250.00 ),
("C2" ,"DBA ORACLE" ,6850.00 ),
("C3" ,"Coord Adm" ,4850.00 ),
("C4" ,"Estagiario" ,1250.00 ),
("C5" ,"Analista de sistemas sr",1130.00),
("C6" ,"Analista de sistemas pl",8820.00),
("C7" ,"gerente" ,2020.00)

insert into itau.funcionario(nome_funcionario,cod_cargo)
values
("LUIZz","C7")
("JOSE","C1"),
("MARIA","C2"),
("SILVA","C1"),
("PEREIRA","C3"),
("FRANSISCO","C4"),
("JULIANO","C6"),
("JULIANA","C5"),
("JAMES","C2"),
("JORGE","C1"),
("ALLAN","C3"),
("LUIZ","C7")


SELECT f.matricula, f.nome_funcionario, c.nome_cargo, c.valor_cargo
FROM itau.cargo AS c
INNER JOIN itau.funcionario AS f
ON(f.cod_cargo = c.cod_cargo)

SELECT f.matricula, f.nome_funcionario, c.nome_cargo, c.valor_cargo
FROM itau.cargo AS c
LEFT JOIN itau.funcionario AS f
ON(f.cod_cargo = c.cod_cargo)



drop table itau.fucionario


SELECT COUNT(*) as qtde_pessoas_cargo,c.nome_cargo
FROM itau.cargo AS c
LEFT JOIN itau.funcionario AS f
ON(f.cod_cargo = c.cod_cargo) group by c.nome_cargo

SELECT c.nome_cargo,COUNT(c.cod_cargo) as qtde_pessoas_cargo
FROM itau.cargo AS c
LEFT JOIN itau.funcionario AS f
ON(f.cod_cargo = c.cod_cargo) group by c.nome_cargo

SELECT *
FROM itau.cargo AS c
LEFT JOIN itau.funcionario AS f
ON(f.cod_cargo = c.cod_cargo) 


CREATE DATABASE bkp_tabelas;

create table bkp_tabelas.cargo select * from itau.cargo;
create table bkp_tabelas.clientes select * from itau.clientes;
create table bkp_tabelas.controle_horas select * from itau.controle_horas;
create table bkp_tabelas.marcas select * from itau.marcas;
create table bkp_tabelas.produtos select * from itau.produtos;

create table itau.cargo1 select * from itau.cargo;
create table itau.clientes2 select * from itau.clientes;
create table itau.controle_horas3 select * from itau.controle_horas;
create table itau.marcas4 select * from itau.marcas;
create table itau.produtos4 select * from itau.produtos;

drop table itau.cargo;
drop table itau.clientes;
drop table itau.controle_horas;
drop table itau.marcas;
drop table itau.produtos;

use bkp_tabelas
*/