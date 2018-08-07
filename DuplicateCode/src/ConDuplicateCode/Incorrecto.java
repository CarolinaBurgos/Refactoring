/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConDuplicateCode;

/**
 *
 * @author Carolina
 */
public class Incorrecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double arreglo1[] = {5,3,1,2};
        double arreglo2[] = {8,9,6,5,1,2}; 
        
        double suma1 = 0;
        double suma2 = 0;
        
        double promedio1 = 0;
        double promedio2 = 0;

        for (int i = 0; i < arreglo1.length; i++) {
            suma1 += arreglo1[i];
        }
        promedio1 = suma1 / arreglo1.length;
        System.out.println("El promedio1 es: " + promedio1);

        for (int i = 0; i < arreglo2.length; i++) {
            suma2 += arreglo2[i];
        }
        promedio2 = suma2 / arreglo2.length;
        System.out.println("El promedio2 es: " + promedio2);
    }
    
}
