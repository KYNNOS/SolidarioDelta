package controller;

import model.EntidadeExterna;
import java.util.ArrayList;
import java.util.Date;

public class GestaoEntidadeExterna {
    ArrayList<EntidadeExterna> _entidadeExterna;
    
    public GestaoEntidadeExterna(){
        _entidadeExterna = new ArrayList<>();
    }
    
    public void addEntidadeExterna(int idEntidadeExterna, String servicoFornece, int id, String nome, String morada, String codigoPostal, int NIF, int NISS, String contacto, String email, String password, Date apagado){
        EntidadeExterna ee = new EntidadeExterna( idEntidadeExterna, servicoFornece, id, nome, morada, codigoPostal, NIF, NISS, contacto, email, password, apagado);
        
        _entidadeExterna.add(ee);
    }
}
