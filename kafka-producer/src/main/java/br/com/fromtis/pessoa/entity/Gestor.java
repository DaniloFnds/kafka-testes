package br.com.fromtis.pessoa.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TB_PESSOA")
@Entity
@AttributeOverride(name = "id", column = @Column(name = "ID_PESSOA"))
@Getter @Setter
public class Gestor extends AbstractPersistable<Integer> {

    @Column(name = "NM_PESSOA")
    private String nome;
}
