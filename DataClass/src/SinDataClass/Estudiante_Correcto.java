/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinDataClass;

import java.util.LinkedList;

/**
 *
 * @author Carolina
 */
public class Estudiante_Correcto {
       
    private String nombre;
    private String id;
    private String carrera;
    private int edad;
    private LinkedList<String> materias = new LinkedList<>();

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

    public LinkedList getMaterias() {
        return materias;
    }
    
    public LinkedList addMateria(String materia) {
        this.materias.add(materia);
        return this.materias;
    }
    
    public LinkedList removerMateria(String materia) {
        this.materias.remove(materia);
        return this.materias;
    }
    
}