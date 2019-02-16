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
    
    //Se le agregan 4 campos más
    private String fcreacionFactura;
    private String fajusteFactura;
    private double debe;
    private double haber;
    
    public CuentaCredito(String nit, String nombre, double pago,int codigo,String tarjeta){
        super(nit,nombre,pago);
        this.codigo = codigo;
        this.tarjeta = tarjeta;
    }
    
    //Se crea otro constructor para cuente corriente
    public CuentaCredito(String nit, String nombre, double pago,int codigo,String tarjeta,String fcreacion, String fajuste, double debe, double haber){
        super(nit,nombre,pago);
        this.codigo = codigo;
        this.tarjeta = tarjeta;
        this.fcreacionFactura = fcreacion;
        this.fajusteFactura = fajuste;
        this.debe = debe;
        this.haber = haber;
    }

    public String getFcreacionFactura() {
        return fcreacionFactura;
    }

    public void setFcreacionFactura(String fcreacionFactura) {
        this.fcreacionFactura = fcreacionFactura;
    }

    public String getFajusteFactura() {
        return fajusteFactura;
    }

    public void setFajusteFactura(String fajusteFactura) {
        this.fajusteFactura = fajusteFactura;
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
    

    public int getCodigo() {
        return codigo;
    }

    public String getTarjeta() {
        return tarjeta;
    }
}
