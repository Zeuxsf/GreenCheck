package br.com.projeto_verde.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record RespostaRequest(


        Long idEmpresa,

        @NotNull
        @Min(1)
        @Max(10)
        Integer pergunta1,

        @NotNull
        @Min(1)
        @Max(10)
        Integer pergunta2,

        @NotNull
        @Min(1)
        @Max(10)
        Integer pergunta3,

        @NotNull
        @Min(1)
        @Max(10)

        Integer pergunta4,
        @NotNull
        @Min(1)
        @Max(10)
        Integer pergunta5,

        @NotNull
        @Min(1)
        @Max(10)
        Integer pergunta6,

        @NotNull
        @Min(1)
        @Max(10)
        Integer pergunta7,

        @NotNull
        @Min(1)
        @Max(10)
        Integer pergunta8,

        @NotNull
        @Min(1)
        @Max(10)
        Integer pergunta9,

        @NotNull
        @Min(1)
        @Max(10)
        Integer pergunta10
) {
}
