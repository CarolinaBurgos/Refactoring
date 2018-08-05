/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Incorrecto;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Incorrecto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double est; //Valor de la estatura
        double p; //Valor del peso 
        double imc; //Valor del indice de masa corporal

        System.out.print("Ingrese su peso en kg: ");
        p = sc.nextFloat();

        System.out.print("Ingrese su estatura en m: ");
        est = sc.nextFloat();

        imc = imc(p, est);
        System.out.println("\nSu indice de masa corporal es: " + imc);

        if (imc < 18.5) { //Si el indice de masa corporal es menor a 18.5, la persona posee un peso bajo
            System.out.println("\nBAJO PESO"); 
        //Si el indice de masa corporal esta entre 18.5 y 24.99, la persona posee un peso normal
        } else if (imc > 18.5 && imc < 24.99) {
            System.out.println("\nPESO NORMAL");
        //Si el indice de masa corporal es menor a 18.5, la persona posee sobrepeso
        } else if (imc >= 25.00) {
            System.out.println("\nSOBREPESO");
        }
    }
    
    //Metodo que permite el calculo de indice de masa corporal
    
    /**
     * Metodo que permite el calculo de indice de masa corporal
     * @param p valor del peso
     * @param e valor de la estatura
     * @return valor del indice de masa corporal
     */
    public static double imc(double p, double e) {
        return p / Math.pow(e, 2);
    }

}
