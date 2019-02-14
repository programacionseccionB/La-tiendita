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
public class CuentaEfectivo extends Clientes {
    private int transaccion;
    
    public CuentaEfectivo(String nit,String nombre,double pago,int transaccion){
        super(nit,nombre,pago);
        this.transaccion = transaccion;
    }

    public int getTransaccion() {
        return transaccion;
    }
}
