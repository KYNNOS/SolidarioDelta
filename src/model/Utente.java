package model;

import java.util.Date;

public class Utente extends Entidade{
    private int idUtente;
    private Date dataNascimento;
    private String restricaoAlimentar;
    private String alergias;
    private String medicacao;
    private String contactoEmergencia;
    private String doencaCronica;
    private int grauAutonomia;
    private String isolamentoSocial;
    private String necessidadeMedica;
    private int escalao;
    private int agregadoFamiliar;
    private String cc;
    private String responsaveis;
    private float custoUtente;
    private float rendimentoFamiliar;
    private String observacoes;

    public Utente(int idUtente, Date dataNascimento, String restricaoAlimentar, String alergias, String medicacao, String contactoEmergencia, String doencaCronica, int grauAutonomia, String isolamentoSocial, String necessidadeMedica, int escalao, int agregadoFamiliar, String cc, String responsaveis, float custoUtente, float rendimentoFamiliar, String observacoes, int id, String nome, String morada, String codigoPostal, int NIF, int NISS, String contacto, String email, String password, Date apagado) {
        super(id, nome, morada, codigoPostal, NIF, NISS, contacto, email, password, apagado);
        this.idUtente = idUtente;
        this.dataNascimento = dataNascimento;
        this.restricaoAlimentar = restricaoAlimentar;
        this.alergias = alergias;
        this.medicacao = medicacao;
        this.contactoEmergencia = contactoEmergencia;
        this.doencaCronica = doencaCronica;
        this.grauAutonomia = grauAutonomia;
        this.isolamentoSocial = isolamentoSocial;
        this.necessidadeMedica = necessidadeMedica;
        this.escalao = escalao;
        this.agregadoFamiliar = agregadoFamiliar;
        this.cc = cc;
        this.responsaveis = responsaveis;
        this.custoUtente = custoUtente;
        this.rendimentoFamiliar = rendimentoFamiliar;
        this.observacoes = observacoes;
    }

    public int getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRestricaoAlimentar() {
        return restricaoAlimentar;
    }

    public void setRestricaoAlimentar(String restricaoAlimentar) {
        this.restricaoAlimentar = restricaoAlimentar;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }

    public String getDoencaCronica() {
        return doencaCronica;
    }

    public void setDoencaCronica(String doencaCronica) {
        this.doencaCronica = doencaCronica;
    }

    public int getGrauAutonomia() {
        return grauAutonomia;
    }

    public void setGrauAutonomia(int grauAutonomia) {
        this.grauAutonomia = grauAutonomia;
    }

    public String getIsolamentoSocial() {
        return isolamentoSocial;
    }

    public void setIsolamentoSocial(String isolamentoSocial) {
        this.isolamentoSocial = isolamentoSocial;
    }

    public String getNecessidadeMedica() {
        return necessidadeMedica;
    }

    public void setNecessidadeMedica(String necessidadeMedica) {
        this.necessidadeMedica = necessidadeMedica;
    }

    public int getEscalao() {
        return escalao;
    }

    public void setEscalao(int escalao) {
        this.escalao = escalao;
    }

    public int getAgregadoFamiliar() {
        return agregadoFamiliar;
    }

    public void setAgregadoFamiliar(int agregadoFamiliar) {
        this.agregadoFamiliar = agregadoFamiliar;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(String responsaveis) {
        this.responsaveis = responsaveis;
    }

    public float getCustoUtente() {
        return custoUtente;
    }

    public void setCustoUtente(float custoUtente) {
        this.custoUtente = custoUtente;
    }

    public float getRendimentoFamiliar() {
        return rendimentoFamiliar;
    }

    public void setRendimentoFamiliar(float rendimentoFamiliar) {
        this.rendimentoFamiliar = rendimentoFamiliar;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
}
