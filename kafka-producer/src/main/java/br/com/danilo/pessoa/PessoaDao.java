package br.com.danilo.pessoa;

import br.com.danilo.pessoa.entity.Gestor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaDao extends JpaRepository<Gestor, Integer> {
}
