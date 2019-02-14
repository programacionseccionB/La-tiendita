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
public class CuentaCredito extends Clientes{
    private int codigo;
    private String tarjeta;
    
    public CuentaCredito(String nit, String nombre, double pago,int codigo,String tarjeta){
        super(nit,nombre,pago);
        this.codigo = codigo;
        this.tarjeta = tarjeta;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTarjeta() {
        return tarjeta;
    }
}
