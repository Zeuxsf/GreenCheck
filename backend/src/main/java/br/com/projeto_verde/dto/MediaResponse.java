package br.com.projeto_verde.dto;

import java.math.BigDecimal;

public record MediaResponse(
        Long idEmpresa,
        String nomeEmpresa,
        BigDecimal mediaPergunta1,
        BigDecimal mediaPergunta2,
        BigDecimal mediaPergunta3,
        BigDecimal mediaPergunta4,
        BigDecimal mediaPergunta5,
        BigDecimal mediaPergunta6,
        BigDecimal mediaPergunta7,
        BigDecimal mediaPergunta8,
        BigDecimal mediaPergunta9,
        BigDecimal mediaPergunta10,
        BigDecimal mediaEmpresa
) {
}
