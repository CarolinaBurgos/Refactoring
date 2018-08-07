/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinDataClumps;

/**
 *
 * @author Carolina
 */
public class Correcto {
    
    public static void main(String args[]) {
        
        String firstName = "Carolina";
        String lastName = "Burgos";
        int age = 22;
        String gender = "girl";
        String occupation = "estudiante";
        String city = "Guayaquil";
    
        Person persona = new Person(firstName, lastName, age, gender, occupation, city);
        persona.welcomeNew();
        persona.work();
        
    }
}
