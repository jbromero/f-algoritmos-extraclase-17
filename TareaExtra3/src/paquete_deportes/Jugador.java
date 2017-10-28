package paquete_deportes;
/**
 * @author jbromero
 */
public class Jugador {
    private String nombre;
    private String posicion;
    private int edad;
    
    public Jugador(String nom,String pos,int ed){
        nombre = nom;
        posicion = pos;
        edad = ed;
    }
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_posicion(String pos){
        posicion = pos;
    }
    
    public String obtener_posicion(){
        return posicion;
    }
    
    public void establecer_edad(int ed){
        edad = ed;
    }
    
    public int obtener_edad(){
        return edad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s - %s - %d años",obtener_nombre(),obtener_posicion(),obtener_edad());
        return cadena;
    }
}
