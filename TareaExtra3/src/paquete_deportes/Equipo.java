package paquete_deportes;
/**
 * @author jbromero
 */
public class Equipo {
    private String nombre;
    private String siglas;
    private int anio_fundacion;
    private Jugador[] jugadores;
    private Tecnico[] tecnicos;
    
    public Equipo(String nom,String sig,int anio,Jugador[] jugadore,Tecnico[] tecnico){
        nombre = nom;
        siglas = sig;
        anio_fundacion = anio;
        jugadores = jugadore;
        tecnicos = tecnico;
    }
    
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
    
    public void establecer_anio_fundacion(int anio){
        anio_fundacion = anio;
    }
    
    public int obtener_anio_fundacion(){
        return anio_fundacion;
    }
    
    public void establecer_jugadores(int n, Jugador jugador){
        jugadores[n] = jugador;
    }
    
    public Jugador[] obtener_jugadores(){
        return jugadores;
    }
    
    public void establecer_tecnicos(int n, Tecnico tecnico){
        tecnicos[n] = tecnico;
    }
    
    public Tecnico[] obtener_tecnicos(){
        return tecnicos;
    }
        
    /*public int obtener_promedio_edad_jugadores(){
        return;
    }
    
    public int obtener_promedio_edad_tecnicos(){
        return;
    }*/
    
    @Override
    public String toString(){
        String cadena = String.format("");
        return cadena;
    }
}
