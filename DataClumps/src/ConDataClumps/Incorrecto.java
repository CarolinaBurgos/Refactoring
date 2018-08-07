/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConDataClumps;

/**
 *
 * @author Carolina
 */
public class Incorrecto {

    public static void main(String args[]) {

        String firstName = "Carolina";
        String lastName = "Burgos";
        int age = 22;
        String gender = "girl";
        String occupation = "estudiante";
        String city = "Guayaquil";

        welcomeNew(firstName, lastName, age, gender, occupation, city);
    }

    public static void welcomeNew(String firstName, String lastName, int age, String gender, String occupation, String city) {
        System.out.printf("Welcome %s %s, a %d-year-old %s from %s who works as a %s\n", firstName, lastName, age, gender, city, occupation);
    }
}
