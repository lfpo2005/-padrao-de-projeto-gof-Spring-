package dio.padrao.padraospring.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;
    @ManyToOne
    private Endereco endereco;

}
