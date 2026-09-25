package br.com.projeto_verde.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "medias")
@AllArgsConstructor
@NoArgsConstructor
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_media")
    private Long idMedia;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_empresa", nullable = false, unique = true)
    private Empresa empresa;

    @Column(name = "media_pergunta_1", nullable = false, precision = 4, scale = 2)
    private BigDecimal mediaPergunta1;

    @Column(name = "media_pergunta_2", nullable = false, precision = 4, scale = 2)
    private BigDecimal mediaPergunta2;

    @Column(name = "media_pergunta_3", nullable = false, precision = 4, scale = 2)
    private BigDecimal mediaPergunta3;

    @Column(name = "media_pergunta_4", nullable = false, precision = 4, scale = 2)
    private BigDecimal mediaPergunta4;

    @Column(name = "media_pergunta_5", nullable = false, precision = 4, scale = 2)
    private BigDecimal mediaPergunta5;

    @Column(name = "media_pergunta_6", nullable = false, precision = 4, scale = 2)
    private BigDecimal mediaPergunta6;

    @Column(name = "media_pergunta_7", nullable = false, precision = 4, scale = 2)
    private BigDecimal mediaPergunta7;

    @Column(name = "media_pergunta_8", nullable = false, precision = 4, scale = 2)
    private BigDecimal mediaPergunta8;

    @Column(name = "media_pergunta_9", nullable = false, precision = 4, scale = 2)
    private BigDecimal mediaPergunta9;

    @Column(name = "media_pergunta_10", nullable = false, precision = 4, scale = 2)
    private BigDecimal mediaPergunta10;

    @Column(name = "media_empresa", nullable = false, precision = 4, scale = 2)
    private BigDecimal mediaEmpresa;

}
