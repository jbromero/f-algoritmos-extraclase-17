package tarea_1;
/**
 * @author jbromero
 */
public class Titulo {
    private String nombre;
    private String nombre_universidad;
    
    public void establecer_nombreT(String nom){
        nombre = nom;
    }
    
    public String obtener_nombreT(){
        return nombre;
    }
    
    public void establecer_nombre_universidad(String nom_uni){
        nombre_universidad = nom_uni;
    }
    
    public String obtener_nombre_universidad(){
        return nombre_universidad;
    }
}
