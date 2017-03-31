package controller;

import java.util.ArrayList;

import model.Entidade;
import java.util.Date;

public class GestaoEntidade {
    public ArrayList<Entidade> _entidades;
    
    public GestaoEntidade(){
        _entidades = new ArrayList<>();
    }
    
    public void addEntidade(int id, String nome, String morada, String codigoPostal, int NIF, int NISS, String contacto, String email, String password, Date apagado){
        Entidade ent = new Entidade(id, nome, morada, codigoPostal, NIF, NISS, contacto, email, password, apagado);
        
        _entidades.add(ent);
    }
}
