package tp7labi;

import java.util.ArrayList;

public class Alumno {
    
    private int legajo;
    private String apellido;
    private String nombre;
    private ArrayList<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias = new ArrayList();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m){
        
        if(!materias.contains(m)){
            
            materias.add(m);
            
        }else{
            //JOptionPane.showMessageDialog(this, "El alumno ya esta inscripto a " + m.getNombre());
            //Funciona cuando creemos las vistas?
        }
        
    }
    
    public int cantidadMaterias(){
        
        return materias.size();
        
    }

    @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + ", materias=" + materias + '}';
    }
    
    
    
}
