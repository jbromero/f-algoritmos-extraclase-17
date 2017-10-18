package tarea_1;
/**
 * @author jbromero
 */
public class Docente {
    private String nombre;
    private String apellido;
    private String titulo_tercer_nivel;
    private String titulo_cuarto_nivel;
    private String asignatura_1;
    private String asignatura_2;
    Titulo a = new Titulo();
    Asignatura b = new Asignatura();
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_apellido(String ape){
        apellido = ape;
    }
    
    public String obtener_apellido(){
        return apellido;
    }
    
    public void establecer_titulo_tercer_nivel(String ter, String nomu){
        a.establecer_nombreT(ter);
        a.establecer_nombre_universidad(nomu);
        titulo_tercer_nivel = a.obtener_nombreT()+" - "+a.obtener_nombre_universidad();
    }
    
    public String obtener_titulo_tercer_nivel(){
        return titulo_tercer_nivel;
    }
    
    public void establecer_titulo_cuarto_nivel(String cua, String nomu){
        a.establecer_nombreT(cua);
        a.establecer_nombre_universidad(nomu);
        titulo_cuarto_nivel = a.obtener_nombreT()+" - "+a.obtener_nombre_universidad();
    }
    
    public String obtener_titulo_cuarto_nivel(){
        return titulo_cuarto_nivel;
    }
    
    public void establecer_asignatura_1(String asi1, String cre1){
        b.establecer_nombreA(asi1);
        b.establecer_credito(cre1);
        asignatura_1 = b.obtener_nombreA()+" con número de créditos "+b.obtener_credito();
    }
    
    public String obtener_asignatura_1(){
        return asignatura_1;
    }
    
    public void establecer_asignatura_2(String asi2, String cre2){
        b.establecer_nombreA(asi2);
        b.establecer_credito(cre2);
        asignatura_2 = b.obtener_nombreA()+" con número de créditos "+b.obtener_credito();
    }
    
    public String obtener_asignatura_2(){
        return asignatura_2;
    }
}
