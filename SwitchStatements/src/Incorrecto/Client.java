/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Incorrecto;

public class Client {

    private double a;
    private double b;
    private double r;

    public double calculateArea(int shape) {
        double area = 0;
        switch (shape) {
            case 4: //Cuadrado
                area = a * a;
                break;
            case 2: //Rectangulo (solo 2 lados son iguales)
                area = a * b;
                break;
            case 0: //Circulo
                area = Math.PI * r * r;
                break;
        }
        return area;
    }

    public double calculatePerimeter(int shape) {
        double perimeter = 0;
        switch (shape) {
            case 4: //Cuadrado
                perimeter = 4 * a;
                break;
            case 2: //Rectangulo (solo 2 lados son iguales)
                perimeter = 2 * (a + b);
                break;
            case 0: //Circulo
                perimeter = 2 * Math.PI * r;
                break;
        }
        return perimeter;
    }

}
