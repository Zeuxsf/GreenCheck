package br.com.projeto_verde.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "respostas")
@AllArgsConstructor
@NoArgsConstructor
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_resposta")
    private Long idResposta;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_empresa", nullable = false)
    private Empresa empresa;

    @Column(name = "pergunta_1", nullable = false)
    private Short pergunta1;

    @Column(name = "pergunta_2", nullable = false)
    private Short pergunta2;

    @Column(name = "pergunta_3", nullable = false)
    private Short pergunta3;

    @Column(name = "pergunta_4", nullable = false)
    private Short pergunta4;

    @Column(name = "pergunta_5", nullable = false)
    private Short pergunta5;

    @Column(name = "pergunta_6", nullable = false)
    private Short pergunta6;

    @Column(name = "pergunta_7", nullable = false)
    private Short pergunta7;

    @Column(name = "pergunta_8", nullable = false)
    private Short pergunta8;

    @Column(name = "pergunta_9", nullable = false)
    private Short pergunta9;

    @Column(name = "pergunta_10", nullable = false)
    private Short pergunta10;



}
