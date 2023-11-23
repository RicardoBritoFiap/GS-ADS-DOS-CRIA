package com.quickmedconn.Api.view;

import com.quickmedconn.Api.models.Especialidade;
import com.quickmedconn.Api.models.Medico;

import com.quickmedconn.Api.model.Medico;

public record DadosListagemMedico(
        Long id,

        String nome,
        String email,
        String crm,
        Especialidade especialidade) {
public DadosListagemMedico(Medico medico){
    this(medico.getId(),medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
}
}
