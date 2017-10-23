package paquete_academico;
/**
 * @author jbromero
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;
    private Docente docente;
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_creditos(int cre){
        creditos = cre;
    }
    
    public int obtener_creditos(){
        return creditos;
    }
    
    public void establecer_carrera(Carrera n){
        carrera = n;
    }
    
    public Carrera obtener_carrera(){
        return carrera;
    }
    
    public void establecer_docente(Docente n){
        docente = n;
    }
    
    public Docente obtener_docente(){
        return docente;
    }
    
    @Override
    public String toString(){
        String cadena =String.format("%s(%d creditos) de la carrera %s.\nDocente: %s",obtener_nombre(),obtener_creditos(),obtener_carrera(),obtener_docente());
        return cadena;
    }
}
