create table cliente (
	id bigint not null auto_increment,
    nome varchar(60) not null,
    cpf varchar(255) not null,
    endereco varchar(255) not null,
    
    primary key (id)
);