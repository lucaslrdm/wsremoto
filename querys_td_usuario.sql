SELECT * FROM itau.tb_usuario;

insert into itau.tb_usuario
(email,foto,nome,senha)
values
("lucas@hotmail..com.br","\\\fswcorp\\cto\\sppti\\gmpd\\img.jpg","lucs" ,"senhas")

update itau.tb_usuario set nome = "Lucas R. de Menezes" where id=1

-- delete  FROM itau.tb_usuario where id >0;

create table itau.bkp_tb_usuario select * from itau.tb_usuario
