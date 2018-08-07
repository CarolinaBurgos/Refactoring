/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConPrimitiveObsession;

public class Incorrecto {
    
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setId("452186"); //Al id le pueden poner cualquier cosa, es mejor crear su propio objeto
        System.out.println("¿El ID es valido? " + isValid(p.getId()));
    }
    
    public static boolean isValid(String id){        
        if(id.length() == 8){
            return true;
        }        
        return false;
    }
    
}
