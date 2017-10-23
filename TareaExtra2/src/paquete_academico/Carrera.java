package paquete_academico;
/**
 * @author jbromero
 */
public class Carrera {
    private String nombre;
    private String modalidad;
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_modalidad(String mod){
        modalidad = mod;
    }
    
    public String obtener_modalidad(){
        return modalidad;
    }
    
    @Override
    public String toString(){
        String cadena =String.format("%s - modalidad(%s)",obtener_nombre(),obtener_modalidad());
        return cadena;
    }
}
