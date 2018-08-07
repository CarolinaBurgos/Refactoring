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
public class ProductoID {
    
    private String id;

    public ProductoID(String id) {
        this.id = id;
    }
    
    public boolean isValid(){
        
        boolean bandera = false;
        
        if (id.length() == 8) {
            bandera = true; 
            if (id.contains("@") || id.contains("%") || id.contains("$") || id.contains("&")) {
                bandera = false; 
            }
        }

        return bandera;
    }
    
}
