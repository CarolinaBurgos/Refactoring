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
public class Incorrecto {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante_Incorrecto estudiante = new Estudiante_Incorrecto();
        estudiante.setNombre("Carolina Burgos");
        estudiante.setId("0951478203");
        estudiante.setCarrera("Ing. en Computacion");
        estudiante.setEdad(22);
        
        LinkedList<String> materias = new LinkedList<>();
        materias.add("Diseño de software"); materias.add("Programacion de sistemas");
        materias.add("Metodologia de la investigacion en computacion");
        
        estudiante.setMaterias(materias);
        
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("ID: " + estudiante.getId());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Edad: " + estudiante.getEdad());        
        System.out.println("Materias: " + estudiante.getMaterias());        
    }    
}
