package br.com.fromtis.kafka.kafkaproducer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Usuario {

    private String nome;
    private String sobrenome;
}
