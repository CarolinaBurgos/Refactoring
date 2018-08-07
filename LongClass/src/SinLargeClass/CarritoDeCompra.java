/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinLargeClass;

/**
 *
 * @author Carolina
 */
public class CarritoDeCompra {
    
    private double subtotal;
    private double iva;
    private double total;
    
    private String id_articulo;
    private String articulo;
    private int precio_articulo;
    private int cantidad_articulo;

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public String getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(String id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad_articulo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad_articulo = cantidad;
    }
    
    public void agregarAlCarritoPorID(String id_articulo, int cantidad){
        
        this.id_articulo = id_articulo;
        this.cantidad_articulo = cantidad;
        
        this.subtotal = this.subtotal + (cantidad * this.precio_articulo);
        
    }
    
    public void agregarAlCarritoPorNombre(String articulo, int cantidad){
        
        this.articulo = articulo;
        this.cantidad_articulo = cantidad;
        
        this.subtotal = this.subtotal + (cantidad * this.precio_articulo);
        
    }
    
    public double valorAPagar(){
        
        this.total = this.subtotal * this.iva;
        return this.total;
    
    }
    
}
