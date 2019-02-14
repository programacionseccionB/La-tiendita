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
public class RegistroCCredito {
   ArrayList<CuentaCredito> arregloCC;
   
   public RegistroCCredito(){
       arregloCC = new ArrayList<>();
   }
   
   public void agregarArregloCC(CuentaCredito cc){
       arregloCC.add(cc);
   }
   
   public void mostrarArregloCC(){
       System.out.println("****Listado de transacciones con tarjeta de crédito****");
       for(CuentaCredito cc:arregloCC){
           System.out.println("Transacción[Crédito]: "+cc.getCodigo()+
                   " Nit: "+cc.getNit()+" Nombre: "+cc.getNombre()+
                   " No.Tarjeta: "+cc.getTarjeta()+
                   " Pago: "+cc.getPago());
       }
   }
   
   public double subtotalCredito(){
        double subTotal = arregloCC.stream()
                .mapToDouble(o ->o.getPago())
                .sum();
        return subTotal;
    }
}
