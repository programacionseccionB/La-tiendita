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
public class CuentaCheque extends Clientes {
    private int transaccion;
    private String numCheque;
    
    public CuentaCheque(String nit,String nombre,double pago,int transaccion,String numCheque){
        super(nit,nombre,pago);
        this.transaccion = transaccion;
        this.numCheque = numCheque;
    }

    public int getTransaccion() {
        return transaccion;
    }

    public String getNumCheque() {
        return numCheque;
    }
}
