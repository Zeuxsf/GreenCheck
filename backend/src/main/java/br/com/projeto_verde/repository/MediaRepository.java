package br.com.projeto_verde.repository;

import br.com.projeto_verde.entity.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MediaRepository extends JpaRepository<Media, Long> {

    @Modifying
    @Query(value = """
                   INSERT INTO medias (
                                      id_empresa,
                                      media_pergunta_1,
                                      media_pergunta_2,
                                      media_pergunta_3,
                                      media_pergunta_4,
                                      media_pergunta_5,
                                      media_pergunta_6,
                                      media_pergunta_7,
                                      media_pergunta_8,
                                      media_pergunta_9,
                                      media_pergunta_10,
                                      media_empresa
                                      )
                   SELECT
                         id_empresa,
                         ROUND(AVG(pergunta_1), 2),
                         ROUND(AVG(pergunta_2), 2),
                         ROUND(AVG(pergunta_3), 2),
                         ROUND(AVG(pergunta_4), 2),
                         ROUND(AVG(pergunta_5), 2),
                         ROUND(AVG(pergunta_6), 2),
                         ROUND(AVG(pergunta_7), 2),
                         ROUND(AVG(pergunta_8), 2),
                         ROUND(AVG(pergunta_9), 2),
                         ROUND(AVG(pergunta_10), 2),
                         ROUND((
                                AVG(pergunta_1) +
                                AVG(pergunta_2) +
                                AVG(pergunta_3) +
                                AVG(pergunta_4) +
                                AVG(pergunta_5) +
                                AVG(pergunta_6) +
                                AVG(pergunta_7) +
                                AVG(pergunta_8) +
                                AVG(pergunta_9) +
                                AVG(pergunta_10)
                              ) / 10, 2)
                   FROM respostas
                   WHERE id_empresa = :idEmpresa
                   GROUP BY id_empresa
                   ON CONFLICT (id_empresa) DO UPDATE SET
                         media_pergunta_1 = EXCLUDED.media_pergunta_1,
                         media_pergunta_2 = EXCLUDED.media_pergunta_2,
                         media_pergunta_3 = EXCLUDED.media_pergunta_3,
                         media_pergunta_4 = EXCLUDED.media_pergunta_4,
                         media_pergunta_5 = EXCLUDED.media_pergunta_5,
                         media_pergunta_6 = EXCLUDED.media_pergunta_6,
                         media_pergunta_7 = EXCLUDED.media_pergunta_7,
                         media_pergunta_8 = EXCLUDED.media_pergunta_8,
                         media_pergunta_9 = EXCLUDED.media_pergunta_9,
                         media_pergunta_10 = EXCLUDED.media_pergunta_10,
                         media_empresa = EXCLUDED.media_empresa
                   """, nativeQuery = true)
    void atualizarMedia(@Param("idEmpresa") Long idEmpresa);

    @Query("""
           SELECT m
           FROM Media m 
           JOIN FETCH m.empresa 
           ORDER BY m.mediaEmpresa DESC                                 
           """)
    List<Media> buscarTodasOrdenadas();
}
