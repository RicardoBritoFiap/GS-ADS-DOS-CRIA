package com.quickmed.backend.service;

import com.quickmed.backend.entities.Paciente;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CadastroPacienteService {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String sexo;
    private String email;
    private String telefone;
    private CadastroEnderecoService endereco;
    private String sintoma;
    private String planoSaude;
    private String historicoMedico;

    public static Paciente getPacienteById(Long id){
        return null;
    }


    public CadastroEnderecoService getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(CadastroEnderecoService endereco) {
        this.endereco = endereco;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }
}
