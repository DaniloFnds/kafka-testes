package br.com.fromtis.receptor.resources;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Notificacao {

    private String palavra;

    private String linha;

    private String arquivo;
}
