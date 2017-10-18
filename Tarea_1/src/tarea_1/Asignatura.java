package tarea_1;
/**
 * @author jbromero
 */
public class Asignatura {
    private String nombre;
    private String creditos;
    
    public void establecer_nombreA(String nom){
        nombre = nom;
    }
    
    public String obtener_nombreA(){
        return nombre;
    }
    
    public void establecer_credito(String cre){
        creditos = cre;
    }
    
    public String obtener_credito(){
        return creditos;
    }
}
