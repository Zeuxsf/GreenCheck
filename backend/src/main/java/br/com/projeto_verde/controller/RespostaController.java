package br.com.projeto_verde.controller;

import br.com.projeto_verde.dto.RespostaRequest;
import br.com.projeto_verde.entity.Resposta;
import br.com.projeto_verde.service.RespostaService;
import jakarta.validation.Valid;
import org.springframework.boot.http.converter.autoconfigure.ServerHttpMessageConvertersCustomizer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/respostas")
public class RespostaController {

    private final RespostaService respostaService;
    private final ServerHttpMessageConvertersCustomizer serverConvertersCustomizer;

    public RespostaController(RespostaService respostaService, ServerHttpMessageConvertersCustomizer serverConvertersCustomizer){
        this.respostaService = respostaService;
        this.serverConvertersCustomizer = serverConvertersCustomizer;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Resposta salvar(@Valid @RequestBody RespostaRequest request){
        return respostaService.salvar(request);
    }
}
