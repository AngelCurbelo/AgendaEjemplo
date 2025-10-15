package uy.edu.ort.da.agenda.modelo;

public class Contacto {
    
    private String nombreContacto;
    private String TelefonoContacto;
    private TipoContacto tipoContacto;
    
    
    public Contacto(String nombreContacto, String telefonoContacto, TipoContacto tipoContacto) {
        this.nombreContacto = nombreContacto;
        TelefonoContacto = telefonoContacto;
        this.tipoContacto = tipoContacto;
    }


    
}
