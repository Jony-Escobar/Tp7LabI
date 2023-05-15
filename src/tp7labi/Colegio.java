
package tp7labi;

import java.util.LinkedHashMap;
import tp7labi.vistas.Menu;

public class Colegio {
    private static LinkedHashMap<Integer,Materia> materias;
    private static LinkedHashMap<Integer, Alumno> alumnos;
    
    public static LinkedHashMap<Integer, Materia> getMaterias() {
        return materias;
    }

    public static LinkedHashMap<Integer, Alumno> getAlumnos() {
        return alumnos;
    }

    public static void main(String[] args) {
        materias = new LinkedHashMap();
        alumnos = new LinkedHashMap();
        
        //Iniciamos la vista
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
        
        //Creamos materias y alumnos
        
        Materia ingles = new Materia(1, "Ingles", 1);
        Materia matematicas = new Materia(2, "Matematicas", 1);
        Materia laboratorio = new Materia(3, "Laboratorio l", 1);               
        materias.put(1, ingles);
        materias.put(2, matematicas);
        materias.put(3, laboratorio);
        
        Alumno alumno1 = new Alumno(1, "Lopez", "Martin");
        Alumno alumno2 = new Alumno(2, "Martinez", "Brenda");
        alumnos.put(1, alumno1);
        alumnos.put(2, alumno2);
    }
    
}
