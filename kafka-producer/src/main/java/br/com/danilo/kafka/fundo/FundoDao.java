package br.com.danilo.kafka.fundo;

import br.com.danilo.kafka.fundo.entity.Fundo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundoDao extends JpaRepository<Fundo, Integer> {
}
