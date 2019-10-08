package br.com.danilo.pessoa.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TB_PESSOA")
@Entity
@AttributeOverride(name = "id", column = @Column(name = "ID_PESSOA"))
public class Gestor {

    @Column(name = "NM_PESSOA")
    private String nome;
}
