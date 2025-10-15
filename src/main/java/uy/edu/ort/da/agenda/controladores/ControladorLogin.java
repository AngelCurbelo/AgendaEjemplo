package uy.edu.ort.da.agenda.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uy.edu.ort.da.agenda.excepciones.AgendaException;
import uy.edu.ort.da.agenda.modelo.Usuario;
import uy.edu.ort.da.agenda.servicios.Fachada;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/acceso")
public class ControladorLogin {
    @PostMapping("/login")
    public List<Respuesta> login(@RequestParam String userName, @RequestParam String pass) throws AgendaException{
        try{
        Usuario usu = Fachada.getInstancia().login(userName, pass);
        return Respuesta.lista(new Respuesta("loginExitoso", true));
    
    } catch (AgendaException e){
        return Respuesta.lista(new Respuesta("loginFallido", e.getMessage()));
        
    }
}
    

}
