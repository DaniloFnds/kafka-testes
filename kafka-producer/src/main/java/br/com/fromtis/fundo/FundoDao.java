package br.com.fromtis.fundo;

import br.com.fromtis.fundo.entity.Fundo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundoDao extends JpaRepository<Fundo, Integer> {
}
