/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correcto;

import java.util.LinkedList;

/**
 *
 * @author Carolina
 */
public class Correcto {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante_Correcto estudiante = new Estudiante_Correcto();
        estudiante.setNombre("Carolina Burgos");
        estudiante.setId("0951478203");
        estudiante.setCarrera("Ing. en Computacion");
        estudiante.setEdad(22);
        
        estudiante.addMateria("Diseño de software"); estudiante.addMateria("Programacion de sistemas");
        estudiante.addMateria("Metodologia de la investigacion en computacion");
        estudiante.addMateria("Fundamentos del diseño digital");
        
        estudiante.removerMateria("Metodologia de la investigacion en computacion");
        
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("ID: " + estudiante.getId());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Edad: " + estudiante.getEdad());        
        System.out.println("Materias: " + estudiante.getMaterias());
    }
    
}
