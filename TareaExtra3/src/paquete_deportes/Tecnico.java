package paquete_deportes;
/**
 * @author jbromero
 */
public class Tecnico {
    private String nombre;
    private String funcion;
    private int edad;
    
    public Tecnico(String nom,String fun,int ed){
        nombre = nom;
        funcion = fun;
        edad = ed;
    }
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_funcion(String fun){
        funcion = fun;
    }
    
    public String obtener_funcion(){
        return funcion;
    }
    
    public void establecer_edad(int ed){
        edad = ed;
    }
    
    public int obtener_edad(){
        return edad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s - %s - %d años",obtener_nombre(),obtener_funcion(),obtener_edad());
        return cadena;
    }
}
