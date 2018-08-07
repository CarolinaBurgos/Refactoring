/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinComments;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Correcto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double estatura; 
        double peso;
        double indice; 

        System.out.print("Ingrese su peso en kg: ");
        peso = sc.nextFloat();

        System.out.print("Ingrese su estatura en m: ");
        estatura = sc.nextFloat();

        indice = indiceMasaCorporal(peso, estatura);
        System.out.println("\nSu indice de masa corporal es: " + indice);

        if (indice < 18.5) { 
            System.out.println("\nBAJO PESO");
        } else if (indice > 18.5 && indice < 24.99) {
            System.out.println("\nPESO NORMAL");
        } else if (indice >= 25.00) {
            System.out.println("\nSOBREPESO");
        }
    }

    public static double indiceMasaCorporal(double peso, double estatura) {
        double indice = peso / Math.pow(estatura, 2);
        return indice;
    }

}
