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
    private double debe;
    private double haber;
    
    //Se le agregan 4 campos más
    private String fcreacionFactura;

    
    public CuentaCredito(String nit, String nombre, double pago,int codigo,String tarjeta){
        super(nit,nombre,pago);
        this.codigo = codigo;
        this.tarjeta = tarjeta;
    }
    
    //Se crea otro constructor para cuente corriente
    public CuentaCredito(String nit, String nombre, double pago,int codigo,String tarjeta,String fcreacion, double debe, double haber){
        super(nit,nombre,pago);
        this.codigo = codigo;
        this.tarjeta = tarjeta;
        this.fcreacionFactura = fcreacion;
        this.debe = debe;
        this.haber = haber;
        
    }
        
    public double getDebe() {
        return debe;
    }

    public void setDebe(double debe) {
        this.debe = debe;
    }

    public double getHaber() {
        return haber;
    }

    public void setHaber(double haber) {
        this.haber = haber;
    }
    

    public String getFcreacionFactura() {
        return fcreacionFactura;
    }

    public void setFcreacionFactura(String fcreacionFactura) {
        this.fcreacionFactura = fcreacionFactura;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getTarjeta() {
        return tarjeta;
    }
    
  
}
