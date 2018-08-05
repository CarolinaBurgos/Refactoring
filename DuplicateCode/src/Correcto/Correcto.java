/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correcto;

/**
 *
 * @author Carolina
 */
public class Correcto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double arreglo1[] = {5,3,1,2};
        double arreglo2[] = {8,9,6,5,1,2}; 
        
        System.out.println("El promedio1 es: " + calcularPromedio(arreglo1));

        System.out.println("El promedio2 es: " + calcularPromedio(arreglo2));
    }
    
    public static double calcularPromedio(double arreglo[]) {
        
        double suma = 0;
        double promedio = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        promedio = suma / arreglo.length;
        
        return promedio;
        
    }
    
}
