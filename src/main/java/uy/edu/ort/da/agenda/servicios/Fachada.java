package uy.edu.ort.da.agenda.servicios;

import uy.edu.ort.da.agenda.excepciones.AgendaException;
import uy.edu.ort.da.agenda.modelo.Usuario;

//Singleton
public class Fachada {
    //atributo privado estatico de la misma clase
    private static Fachada instancia; 
    private ServicioUsuarios sUsuarios;
    //metodo publico estatico que devuelve la instancia
    public static Fachada getInstancia(){
        if(instancia == null){
            instancia = new Fachada();
        }
        return instancia;
    }
    //constructor privado
    private Fachada(){
        sUsuarios = new ServicioUsuarios();
    }
    public void agregar(String user, String pass, String nombreCompleto) {
        sUsuarios.agregar(user, pass, nombreCompleto);
    }
    public Usuario login(String user, String pass) throws AgendaException {
        return sUsuarios.login(user, pass);
    }

}
