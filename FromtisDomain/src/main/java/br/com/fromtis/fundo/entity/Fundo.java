package br.com.fromtis.fundo.entity;

import br.com.fromtis.pessoa.entity.Gestor;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Table(name = "TB_FUNDO")
@Entity
@AttributeOverride(name = "id", column = @Column(name = "ID_FUNDO"))
@Data
public class Fundo extends AbstractPersistable<Integer> {

    @Column(name = "NM_FUNDO")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "ID_GESTOR")
    private Gestor gestor;
}
