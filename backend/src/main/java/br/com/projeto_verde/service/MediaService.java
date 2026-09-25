package br.com.projeto_verde.service;

import br.com.projeto_verde.dto.MediaResponse;
import br.com.projeto_verde.entity.Media;
import br.com.projeto_verde.repository.MediaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService {

    private final MediaRepository mediaRepository;

    public MediaService(MediaRepository mediaRepository){
        this.mediaRepository = mediaRepository;
    }

    public List<MediaResponse> buscarTodas(){
        return  mediaRepository.buscarTodasOrdenadas()
                .stream()
                .map(this::paraResponse)
                .toList();
    }

    private MediaResponse paraResponse(Media media){
        return new MediaResponse(
                media.getEmpresa().getIdEmpresa(),
                media.getEmpresa().getNome(),
                media.getMediaPergunta1(),
                media.getMediaPergunta2(),
                media.getMediaPergunta3(),
                media.getMediaPergunta4(),
                media.getMediaPergunta5(),
                media.getMediaPergunta6(),
                media.getMediaPergunta7(),
                media.getMediaPergunta8(),
                media.getMediaPergunta9(),
                media.getMediaPergunta10(),
                media.getMediaEmpresa()
        );
    }
}
