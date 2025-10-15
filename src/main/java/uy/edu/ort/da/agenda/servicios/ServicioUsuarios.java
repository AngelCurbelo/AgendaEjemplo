package uy.edu.ort.da.agenda.servicios;

import java.util.ArrayList;

import uy.edu.ort.da.agenda.excepciones.AgendaException;
import uy.edu.ort.da.agenda.modelo.Usuario;

public class ServicioUsuarios {
    private ArrayList<Usuario> usuarios;


    public ServicioUsuarios(){
        usuarios = new ArrayList<Usuario>();
    }

    public void agregar(String user, String pass, String nombreCompleto){
        //Hacer las validaciones y excepciones
        usuarios.add(new Usuario(user, pass, nombreCompleto));
    }

    public Usuario login(String user, String pass) throws AgendaException{
        for(Usuario u : usuarios){
            if(u.getNombre().equals(user) && u.getPassword().equals(pass)) return u; //no aplica experto
        }
        throw new AgendaException("Usuario y/o password incorrecto");
    }
}
