package tarea_1;

/**
 * @author jbromero
 */
public class Principal {
    public static void main(String[] args) {
        Docente a = new Docente();
        Docente b = new Docente();
        
        a.establecer_nombre("Luis V.");
        a.establecer_apellido("Perez J.");
        a.establecer_asignatura_1("Matemáticas","8");
        a.establecer_asignatura_2("Física","6");
        a.establecer_titulo_tercer_nivel("Licenciado en Físico Matemáticas","Universidad Politécnica");
        a.establecer_titulo_cuarto_nivel("Magister en Docencia Matemática","Universidad Valenciana");
        
        System.out.println("Datos del Docente A:\n"
                + "Nombres: "+a.obtener_nombre()+"\n"
                + "Apellidos: "+a.obtener_apellido()+"\n"
                + "Tiene a su cargo las asignaturas:\n"
                + "Asignatura 1: "+a.obtener_asignatura_1()+"\n"
                + "Asignatura 2: "+a.obtener_asignatura_2()+"\n"
                + "El docente tiene los siguientes titulos acedemicos:\n"
                + "Titulo 3er nivel: "+a.obtener_titulo_tercer_nivel()+"\n"
                + "Titulo 4er nivel: "+a.obtener_titulo_cuarto_nivel());
        
        b.establecer_nombre("Ana M.");
        b.establecer_apellido("Velez P.");
        b.establecer_asignatura_1("Sociales","9");
        b.establecer_asignatura_2("Literatura","10");
        b.establecer_titulo_tercer_nivel("Licenciado en Ciencias Sociales","Universidad Salesiana");
        b.establecer_titulo_cuarto_nivel("Magister en Docencia Social","Universidad Cataluña");
        
        System.out.println("\nDatos del Docente B:\n"
                + "Nombres: "+b.obtener_nombre()+"\n"
                + "Apellidos: "+b.obtener_apellido()+"\n"
                + "Tiene a su cargo las asignaturas:\n"
                + "Asignatura 1: "+b.obtener_asignatura_1()+"\n"
                + "Asignatura 2: "+b.obtener_asignatura_2()+"\n"
                + "El docente tiene los siguientes titulos acedemicos:\n"
                + "Titulo 3er nivel: "+b.obtener_titulo_tercer_nivel()+"\n"
                + "Titulo 4er nivel: "+b.obtener_titulo_cuarto_nivel());
    }
}
