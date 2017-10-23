package paquete_principal;
import paquete_academico.*;
import paquete_estudiante.Estudiante;
import paquete_general.Pais;
/**
 * @author jbromero
 */
public class Principal {
    public static void main(String[] args) {
        Estudiante a = new Estudiante();
        Estudiante b = new Estudiante();
        
        Universidad a1_1 = new Universidad();
        Carrera a2_1 = new Carrera();
        Docente a3_1 = new Docente();
        Docente a3_2 = new Docente();
        Asignatura a4_1 = new Asignatura();
        Asignatura a4_2 = new Asignatura();
        Pais a5_1 = new Pais();
        Pais a5_2 = new Pais();
        Pais a5_3 = new Pais();
        
        Universidad b1_1 = new Universidad();
        Carrera b2_1 = new Carrera();
        Docente b3_1 = new Docente();
        Docente b3_2 = new Docente();
        Asignatura b4_1 = new Asignatura();
        Asignatura b4_2 = new Asignatura();
        Pais b5_1 = new Pais();
        Pais b5_2 = new Pais();
        Pais b5_3 = new Pais();
        
        a1_1.establecer_nombre("Universidad Técnica Particular de Loja");
        a1_1.establecer_siglas("UTPL");
        a1_1.establecer_pais(a5_1);
        a2_1.establecer_nombre("Sistemas");
        a2_1.establecer_modalidad("presencial");
        a3_1.establecer_nombres("Mario");
        a3_1.establecer_apellidos("Alcivar");
        a3_1.establecer_pais(a5_2);
        a3_2.establecer_nombres("Maria");
        a3_2.establecer_apellidos("Ruiz");
        a3_2.establecer_pais(a5_2);
        a4_1.establecer_nombre("Matemáticas");
        a4_1.establecer_creditos(10);
        a4_1.establecer_carrera(a2_1);
        a4_1.establecer_docente(a3_1);
        a4_2.establecer_nombre("Física");
        a4_2.establecer_creditos(8);
        a4_2.establecer_carrera(a2_1);
        a4_2.establecer_docente(a3_2);
        a5_1.establecer_nombre("Ecuador");
        a5_2.establecer_nombre("Colombia");
        a5_3.establecer_nombre("Perú");
        
        a.establecer_nombres("Luis V.");
        a.establecer_apellidos("Perez J.");
        a.establecer_universidad(a1_1);
        a.establecer_asignatura_1(a4_1);
        a.establecer_asignatura_2(a4_2);
        
        System.out.println(a+"\n");     
        
        b1_1.establecer_nombre("Universidad Técnica Equinoccial");
        b1_1.establecer_siglas("UTE");
        b1_1.establecer_pais(a5_1);
        b2_1.establecer_nombre("Ingeniería Química");
        b2_1.establecer_modalidad("distancia");
        b3_1.establecer_nombres("Luis");
        b3_1.establecer_apellidos("Armijos");
        b3_1.establecer_pais(b5_2);
        b3_2.establecer_nombres("Maria");
        b3_2.establecer_apellidos("Ruiz");
        b3_2.establecer_pais(b5_2);
        b4_1.establecer_nombre("Biología");
        b4_1.establecer_creditos(9);
        b4_1.establecer_carrera(b2_1);
        b4_1.establecer_docente(b3_1);
        b4_2.establecer_nombre("Física");
        b4_2.establecer_creditos(7);
        b4_2.establecer_carrera(b2_1);
        b4_2.establecer_docente(b3_2);
        b5_1.establecer_nombre("Ecuador");
        b5_2.establecer_nombre("Venezuela");
        b5_3.establecer_nombre("Perú");
        
        b.establecer_nombres("Ana.");
        b.establecer_apellidos("Lima J.");
        b.establecer_universidad(b1_1);
        b.establecer_asignatura_1(b4_1);
        b.establecer_asignatura_2(b4_2);
        
        System.out.println(b);
    }
}
