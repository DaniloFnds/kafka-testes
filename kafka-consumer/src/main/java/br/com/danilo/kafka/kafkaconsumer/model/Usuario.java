package br.com.danilo.kafka.kafkaconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Usuario {

    private String nome;
    private String sobrenome;
}
