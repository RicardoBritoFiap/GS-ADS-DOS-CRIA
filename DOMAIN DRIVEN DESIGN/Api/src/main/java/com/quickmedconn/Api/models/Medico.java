<<<<<<<< HEAD:DOMAIN DRIVEN DESIGN/Api/src/main/java/com/quickmedconn/Api/models/Medico.java
package com.quickmedconn.Api.models;

import com.quickmedconn.Api.view.DadosAtualizacaoMedico;
import com.quickmedconn.Api.view.DadosCadastroMedico;
========
package com.quickmedconn.Api.model;

import com.quickmedconn.Api.endereco.Endereco;
import com.quickmedconn.Api.medico.DadosAtualizacaoMedico;
import com.quickmedconn.Api.medico.DadosCadastroMedico;
import com.quickmedconn.Api.medico.Especialidade;
>>>>>>>> e0361684018fa17620e3b52f9b2fdfb3c35ad70c:DOMAIN DRIVEN DESIGN/Api/src/main/java/com/quickmedconn/Api/model/Medico.java
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String email;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    private String telefone;
    @Embedded
    private  Endereco endereco;

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome () ;
        this.email = dados.email();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
    }

            public Long getId() {
                return null;
                }

    public void atualizarIndinformacoes(DadosAtualizacaoMedico dados) {
        if (dados.nome() != null){
            this.nome = dados.nome();
        }
        if (dados.telefone()!= null){
            this.telefone = dados.telefone();

        }
        if (dados.endereco() !=null){
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }
}