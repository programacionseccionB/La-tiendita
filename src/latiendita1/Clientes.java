/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latiendita1;

/**
 *
 * @author Raul
 */
public class Clientes {
    private String nit;
    private String nombre;
    private double pago;
    
    public Clientes(String nit, String nombre, double pago) {
        this.nit = nit;
        this.nombre = nombre;
        this.pago = pago;
    }

    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPago() {
        return pago;
    } 
    
    public void setPago(double pago){
        this.pago = pago;
    }
}
