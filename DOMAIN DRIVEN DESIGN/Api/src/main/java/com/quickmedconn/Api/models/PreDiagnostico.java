<<<<<<<< HEAD:DOMAIN DRIVEN DESIGN/Api/src/main/java/com/quickmedconn/Api/models/PreDiagnostico.java
package com.quickmedconn.Api.models;

import com.quickmedconn.Api.models.Medico;
import com.quickmedconn.Api.models.Paciente;
========
package com.quickmedconn.Api.model;

import com.quickmedconn.Api.model.Medico;
import com.quickmedconn.Api.model.Paciente;
>>>>>>>> e0361684018fa17620e3b52f9b2fdfb3c35ad70c:DOMAIN DRIVEN DESIGN/Api/src/main/java/com/quickmedconn/Api/model/PreDiagnostico.java
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "prediagnostico")
public class PreDiagnostico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "descricao", length = 300, nullable = false)
    private String descricao;

    @Column(name = "data_diagnostico", nullable = false)
    private LocalDate dataDiagnostico;

    @Column(name = "resultado", length = 50, nullable = false)
    private String resultado;

    @Column(name = "tratamento_recomendado", length = 50, nullable = false)
    private String tratamentoRecomendado;

    @Column(name = "setor_recomendado", length = 50, nullable = false)
    private String setorRecomendado;

    @Column(name = "observacoes", length = 300)
    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;



}

