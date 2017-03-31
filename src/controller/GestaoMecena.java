package controller;

import model.Mecena;
import java.util.ArrayList;
import java.util.Date;

public class GestaoMecena {
    ArrayList <Mecena> _mecena;
    
    public GestaoMecena(){
        _mecena = new ArrayList<>();
    }
    
    public void addMecena(int idMecena, int id, String nome, String morada, String codigoPostal, int NIF, int NISS, String contacto, String email, String password, Date apagado){
        Mecena m = new Mecena(idMecena, id, nome, morada, codigoPostal, NIF, NISS, contacto, email, password, apagado);
        
        _mecena.add(m);
    }
}
