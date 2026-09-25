insert into empresa (nome)
values
    ('Empresa K'),
    ('Empresa M'),
    ('Empresa S'),
    ('Outros');

insert into respostas (
    id_empresa,
    pergunta_1,
    pergunta_2,
    pergunta_3,
    pergunta_4,
    pergunta_5,
    pergunta_6,
    pergunta_7,
    pergunta_8,
    pergunta_9,
    pergunta_10
) values
      (1, 8, 9, 7, 8, 9, 8, 7, 9, 8, 10),
      (1, 9, 8, 8, 9, 8, 9, 8, 8, 9, 9),
      (1, 7, 9, 9, 7, 8, 8, 9, 7, 8, 8),

      (2, 7, 8, 7, 6, 8, 7, 8, 7, 8, 7),
      (2, 8, 7, 8, 7, 7, 8, 7, 8, 7, 8),

      (3, 9, 10, 9, 8, 9, 10, 9, 8, 9, 10),
      (3, 8, 9, 10, 9, 9, 9, 10, 9, 8, 9);