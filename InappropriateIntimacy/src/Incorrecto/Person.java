/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Incorrecto;

/**
 *
 * @author Carolina
 */
public class Person {
    
    private String name;
    private String officeAreaCode;
    private String officeNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return "+" + officeAreaCode + " " + officeNumber;
    }

    public void setTelephoneNumber(String officeAreaCode, String officeNumber) {
        this.officeAreaCode = officeAreaCode;
        this.officeNumber = officeNumber;
    }
    
}
