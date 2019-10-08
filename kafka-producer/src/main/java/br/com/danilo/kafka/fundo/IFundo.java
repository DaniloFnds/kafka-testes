package br.com.danilo.kafka.fundo;

import br.com.danilo.kafka.fundo.entity.Fundo;

public interface IFundo {

    Fundo findOne(Integer id);
}
