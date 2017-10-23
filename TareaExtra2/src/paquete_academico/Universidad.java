package paquete_academico;
import paquete_general.Pais;
/**
 * @author jbromero
 */
public class Universidad {
    private String nombre;
    private String siglas;
    private Pais pais;
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_siglas(String sig){
        siglas = sig;
    }
    
    public String obtener_siglas(){
        return siglas;
    }
    
    public void establecer_pais(Pais n){
        pais = n;
    }
    
    public Pais obtener_pais(){
        return pais;
    }
    
    @Override
    public String toString(){
        String cadena =String.format("%s(%s) - %s",obtener_nombre(),obtener_siglas(),obtener_pais());
        return cadena;
    }
}
