/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinPrimitiveObsession;


public class Correcto {
    
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setId(new ProductoID("4562113@"));
        
        ProductoID pID = p.getId();
        System.out.println("¿El ID es valido? " + pID.isValid());
    }
    
}
