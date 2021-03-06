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
   //Se agrego para la cuenta corriente
   ArrayList<CuentaCredito> arregloCorriente;
   
   public RegistroCCredito(){
       arregloCC = new ArrayList<>();
       //Se agrego para la cuenta corriente
       arregloCorriente = new ArrayList<>();
   }
   
   public void agregarArregloCC(CuentaCredito cc){
       arregloCC.add(cc);
   }
   
   public void agregarCuentaCorriente(CuentaCredito cc){
       arregloCorriente.add(cc);
   }
   
   public void mostrarArregloCC(){
       System.out.println("****Listado de transacciones con tarjeta de crédito****");
       for(CuentaCredito cc:arregloCC){
           /*System.out.println("Transacción[Crédito]: "+cc.getCodigo()+
                   " Nit: "+cc.getNit()+" Nombre: "+cc.getNombre()+
                   " No.Tarjeta: "+cc.getTarjeta()+
                   " Pago: "+cc.getPago());*/
       }
   }
   
   public double subtotalCredito(){
        double subTotal = arregloCC.stream()
                .mapToDouble(o ->o.getPago())
                .sum();
        return subTotal;
    }
   
   public void modificarCliente(int factura, double nuevoHaber){
       for (int i = 0; i < arregloCorriente.size(); i++) {
            if (arregloCorriente.get(i).getCodigo() == factura){
               arregloCorriente.get(i).setHaber(nuevoHaber);
            }
       }
       
   }
   
   public double consultaHaberCliente(int factura){
       for (int i = 0; i < arregloCorriente.size(); i++) {
            
            if (arregloCorriente.get(i).getCodigo() == factura){
               return arregloCorriente.get(i).getHaber();
            }
       }
       return 0;
   }
   
   public double consultaDebeCliente(int factura){
       for (int i = 0; i < arregloCorriente.size(); i++) {
            
            if (arregloCorriente.get(i).getCodigo() == factura){
               return arregloCorriente.get(i).getHaber();
            }
       }
       return 0;
   }
}
