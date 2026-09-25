package br.com.projeto_verde.service;

import br.com.projeto_verde.dto.RespostaRequest;
import br.com.projeto_verde.entity.Empresa;
import br.com.projeto_verde.entity.Resposta;
import br.com.projeto_verde.repository.EmpresaRepository;
import br.com.projeto_verde.repository.MediaRepository;
import br.com.projeto_verde.repository.RespostaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class RespostaService {

    private final RespostaRepository respostaRepository;
    private final EmpresaRepository empresaRepository;
    private final MediaRepository mediaRepository;

    public RespostaService(RespostaRepository respostaRepository, EmpresaRepository empresaRepository, MediaRepository mediaRepository){
        this.respostaRepository = respostaRepository;
        this.empresaRepository = empresaRepository;
        this.mediaRepository = mediaRepository;
    }

    @Transactional
    public Resposta salvar(RespostaRequest request){
        Empresa empresa = empresaRepository.findById(request.idEmpresa())
                .orElseThrow(() -> new IllegalArgumentException("Empresa não encontrada"));

        Resposta resposta = new Resposta();

        resposta.setEmpresa(empresa);
        resposta.setPergunta1(request.pergunta1().shortValue());
        resposta.setPergunta2(request.pergunta2().shortValue());
        resposta.setPergunta3(request.pergunta3().shortValue());
        resposta.setPergunta4(request.pergunta4().shortValue());
        resposta.setPergunta5(request.pergunta5().shortValue());
        resposta.setPergunta6(request.pergunta6().shortValue());
        resposta.setPergunta7(request.pergunta7().shortValue());
        resposta.setPergunta8(request.pergunta8().shortValue());
        resposta.setPergunta9(request.pergunta9().shortValue());
        resposta.setPergunta10(request.pergunta10().shortValue());

        Resposta respostaSalva = respostaRepository.save(resposta);

        mediaRepository.atualizarMedia(request.idEmpresa());

        return respostaSalva;

    }
}
