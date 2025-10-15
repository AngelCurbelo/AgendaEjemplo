package uy.edu.ort.da.agenda.modelo;

import uy.edu.ort.da.agenda.servicios.Fachada;

public class DatosPrueba {
    public static void cargar(){

        Fachada.getInstancia().agregar("a", "a", "Ana");
        Fachada.getInstancia().agregar("b", "b", "Bea");
        Fachada.getInstancia().agregar("c", "c", "Cony");
        
    }
}
