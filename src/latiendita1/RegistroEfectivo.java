/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latiendita1;
import java.util.*;
/**
 *
 * @author Raul
 */
public class RegistroEfectivo {
    ArrayList<CuentaEfectivo> arregloEfectivo;
    
    public RegistroEfectivo(){
        arregloEfectivo = new ArrayList<>();
    }
    
    public void agregarArregloEfectivo(CuentaEfectivo ce){
        arregloEfectivo.add(ce);
    }
    
    public void mostrarArregloEfectivo(){
        System.out.println("****Listado de transacciones en efectivo****");
        for(CuentaEfectivo ce:arregloEfectivo){
            System.out.println("Transaccion[Efectivo]: "+ce.getTransaccion()+
                    " Nit: "+ce.getNit()+" Nombre: "+ce.getNombre()+
                    " Pago: "+ce.getPago());
        }
    }
    
    public double subtotalEfectivo(){
        double subTotal = arregloEfectivo.stream()
                .mapToDouble(o ->o.getPago())
                .sum();
        return subTotal;
    }
}
