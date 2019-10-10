package br.com.fromtis.pessoa;

import br.com.fromtis.pessoa.entity.Gestor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaDao extends JpaRepository<Gestor, Integer> {
}
