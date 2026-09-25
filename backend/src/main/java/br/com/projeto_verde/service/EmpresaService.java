package br.com.projeto_verde.service;

import br.com.projeto_verde.entity.Empresa;
import br.com.projeto_verde.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    public List<Empresa> buscarTodas(){
        return empresaRepository.buscarTodasOrdenadas();
    }
}
