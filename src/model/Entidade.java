package model;

import java.util.Date;

public class Entidade {
    private int id;
    private String nome;
    private String morada;
    private String codigoPostal;
    private int NIF;
    private int NISS;
    private String contacto;
    private String email;
    private String password;
    private Date apagado;

    public Entidade(int id, String nome, String morada, String codigoPostal, int NIF, int NISS, String contacto, String email, String password, Date apagado) {
        this.id = id;
        this.nome = nome;
        this.morada = morada;
        this.codigoPostal = codigoPostal;
        this.NIF = NIF;
        this.NISS = NISS;
        this.contacto = contacto;
        this.email = email;
        this.password = password;
        this.apagado = apagado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public int getNISS() {
        return NISS;
    }

    public void setNISS(int NISS) {
        this.NISS = NISS;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getApagado() {
        return apagado;
    }

    public void setApagado(Date apagado) {
        this.apagado = apagado;
    }
    
    
    
    void login(String email,String password){
        
    }
    
    void registar(){
        
    }
    
    void recuperarConta(){
        
    }
    
}
