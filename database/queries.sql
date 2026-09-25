select
    id_empresa,

    round(avg(pergunta_1), 2) as media_pergunta_1,
    round(avg(pergunta_2), 2) as media_pergunta_2,
    round(avg(pergunta_3), 2) as media_pergunta_3,
    round(avg(pergunta_4), 2) as media_pergunta_4,
    round(avg(pergunta_5), 2) as media_pergunta_5,
    round(avg(pergunta_6), 2) as media_pergunta_6,
    round(avg(pergunta_7), 2) as media_pergunta_7,
    round(avg(pergunta_8), 2) as media_pergunta_8,
    round(avg(pergunta_9), 2) as media_pergunta_9,
    round(avg(pergunta_10), 2) as media_pergunta_10,

    round((
              avg(pergunta_1) +
              avg(pergunta_2) +
              avg(pergunta_3) +
              avg(pergunta_4) +
              avg(pergunta_5) +
              avg(pergunta_6) +
              avg(pergunta_7) +
              avg(pergunta_8) +
              avg(pergunta_9) +
              avg(pergunta_10)
              ) / 10, 2) as media_empresa

from respostas
group by id_empresa
order by media_empresa desc ;