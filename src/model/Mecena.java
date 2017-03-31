package model;

import java.util.Date;

public class Mecena extends Entidade{
    private int idMecena;

    public Mecena(int idMecena, int id, String nome, String morada, String codigoPostal, int NIF, int NISS, String contacto, String email, String password, Date apagado) {
        super(id, nome, morada, codigoPostal, NIF, NISS, contacto, email, password, apagado);
        this.idMecena = idMecena;
    }

    public int getIdMecena() {
        return idMecena;
    }

    public void setIdMecena(int idMecena) {
        this.idMecena = idMecena;
    }
    
}
