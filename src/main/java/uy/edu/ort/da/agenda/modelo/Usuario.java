package uy.edu.ort.da.agenda.modelo;
// import lombok.Getter;
// import lombok.Setter;

public class Usuario {
    //@Getter @Setter
    private String nombre;
    
    private String password;
   // @Getter 
    private String nombreCompleto;

    private Agenda agenda;
    
    public Usuario(String nombre, String password, String nombreCompleto) {
        this.nombre = nombre;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        agenda = new Agenda();
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

}
