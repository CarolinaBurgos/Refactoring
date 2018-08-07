/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConDataClass;

import java.util.LinkedList;

/**
 *
 * @author Carolina
 */
public class Estudiante_Incorrecto {
    
    public String nombre;
    public String id;
    public String carrera;
    public int edad;
    private LinkedList<String> materias;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LinkedList<String> getMaterias() {
        return materias;
    }

    public void setMaterias(LinkedList<String> materias) {
        this.materias = materias;
    }
    
}