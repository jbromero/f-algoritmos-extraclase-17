package paquete_academico;
import paquete_general.Pais;
/**
 * @author jbromero
 */
public class Docente {
    private String nombres;
    private String apellidos;
    private Pais pais;
    
    public void establecer_nombres(String nom){
        nombres = nom;
    }
    
    public String obtener_nombres(){
        return nombres;
    }
    
    public void establecer_apellidos(String ape){
        apellidos = ape;
    }
    
    public String obtener_apellidos(){
        return apellidos;
    }
    
    public void establecer_pais(Pais n){
        pais = n;
    }
    
    public Pais obtener_pais(){
        return pais;
    }
    
    @Override
    public String toString(){
        String cadena =String.format("%s %s - pais %s",obtener_nombres(),obtener_apellidos(),obtener_pais());
        return cadena;
    }
}
