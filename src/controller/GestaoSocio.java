package controller;

import model.Socio;
import java.util.ArrayList;
import java.util.Date;

public class GestaoSocio {
    ArrayList<Socio> _socio;
    
    public GestaoSocio(){
        _socio = new ArrayList<>();
    }
    
    public void addSocio(int idSocio, Date dataNascimento, int id, String nome, String morada, String codigoPostal, int NIF, int NISS, String contacto, String email, String password, Date apagado){
    
        Socio s = new Socio(idSocio, dataNascimento, id, nome, morada, codigoPostal, NIF, NISS, contacto, email, password, apagado);
        
        _socio.add(s);
    }
}
