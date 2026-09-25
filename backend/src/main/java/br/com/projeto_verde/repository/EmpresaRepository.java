package br.com.projeto_verde.repository;

import br.com.projeto_verde.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    @Query("""
          SELECT e
          FROM Empresa e
          ORDER BY e.nome
          """)
    List<Empresa> buscarTodasOrdenadas();
}
