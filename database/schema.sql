create table empresa(
    id_empresa bigint generated always as identity primary key ,
    nome varchar(100) not null

);

create table respostas (
    id_resposta bigint generated always as identity primary key ,
    id_empresa bignint not null,

    pergunta_1 smallint not null check (pergunta_1 between 1 and 10),
    pergunta_2 smallint not null check (pergunta_2 between 1 and 10),
    pergunta_3 smallint not null check (pergunta_3 between 1 and 10),
    pergunta_4 smallint not null check (pergunta_4 between 1 and 10),
    pergunta_5 smallint not null check (pergunta_5 between 1 and 10),
    pergunta_6 smallint not null check (pergunta_6 between 1 and 10),
    pergunta_7 smallint not null check (pergunta_7 between 1 and 10),
    pergunta_8 smallint not null check (pergunta_8 between 1 and 10),
    pergunta_9 smallint not null check (pergunta_9 between 1 and 10),
    pergunta_10 smallint not null check (pergunta_10 between 1 and 10),

    constraint fk_respostas_empresa
                       foreign key (id_empresa)
                       references empresa(id_empresa)
);

create table medias (
    id_media bigint generated always as identity primary key,
    id_empresa bigint not null unique,

    media_pergunta_1 decimal(4,2) not null check (media_pergunta_1 between 1 and 10),
    media_pergunta_2 decimal(4,2) not null check (media_pergunta_2 between 1 and 10),
    media_pergunta_3 decimal(4,2) not null check (media_pergunta_3 between 1 and 10),
    media_pergunta_4 decimal(4,2) not null check (media_pergunta_4 between 1 and 10),
    media_pergunta_5 decimal(4,2) not null check (media_pergunta_5 between 1 and 10),
    media_pergunta_6 decimal(4,2) not null check (media_pergunta_6 between 1 and 10),
    media_pergunta_7 decimal(4,2) not null check (media_pergunta_7 between 1 and 10),
    media_pergunta_8 decimal(4,2) not null check (media_pergunta_8 between 1 and 10),
    media_pergunta_9 decimal(4,2) not null check (media_pergunta_9 between 1 and 10),
    media_pergunta_10 decimal(4,2) not null check (media_pergunta_10 between 1 and 10),

    media_empresa decimal(4,2) not null check (media_empresa between 1 and 10),

    constraint fk_medias_empresa
                    foreign key (id_empresa)
                    references empresa(id_empresa)
);