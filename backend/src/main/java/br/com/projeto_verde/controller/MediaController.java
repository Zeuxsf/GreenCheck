package br.com.projeto_verde.controller;

import br.com.projeto_verde.dto.MediaResponse;
import br.com.projeto_verde.service.MediaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/medias")
public class MediaController {

    private final MediaService mediaService;

    public MediaController(MediaService mediaService){
        this.mediaService = mediaService;
    }

    @GetMapping
    public List<MediaResponse> buscarTodas(){
        return mediaService.buscarTodas();
    }
}
