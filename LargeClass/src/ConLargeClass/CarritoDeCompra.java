/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConLargeClass;

/**
 *
 * @author Carolina
 */
public class CarritoDeCompra {
     
    private double subtotal;
    private double iva;
    private double total;
    
    private Articulo articulo;

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setTotal(double total) {
        this.total = total;
    }   
    
    public void agregarAlCarrito() {
                
        this.subtotal = this.subtotal + (articulo.getCantidad() * articulo.getPrecio_articulo());
        
    }
    
    public double valorAPagar(){
        
        this.total = this.subtotal * this.iva;
        return this.total;
    
    }
    
}
