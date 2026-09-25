package br.com.projeto_verde.controller;

import br.com.projeto_verde.entity.Empresa;
import br.com.projeto_verde.service.EmpresaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService){
        this.empresaService = empresaService;
    }

    @GetMapping
    public List<Empresa> buscarTodas(){
        return empresaService.buscarTodas();
    }
}
