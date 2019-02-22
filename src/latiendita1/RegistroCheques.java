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
public class RegistroCheques {
    ArrayList<CuentaCheque> arregloCheques;
    
    public RegistroCheques(){
        arregloCheques = new ArrayList<>();
    }
    
    public void agregarArregloCheques(CuentaCheque cch){
        arregloCheques.add(cch);
    }
    
    public void mostrarArregloCheques(){
        System.out.println("****Listado de transacciones con cheque****");
        for(CuentaCheque cch:arregloCheques){
            System.out.println("Transaccion[Cheque]: "+cch.getTransaccion()+
                    " Nit: "+cch.getNit()+" Nombre: "+cch.getNombre()+
                    " No.Cheque: "+cch.getNumCheque()+
                    " Pago: "+cch.getPago());
        }
    }
    
    public double subtotalCheques(){
        double subTotal = arregloCheques.stream()
                .mapToDouble(o ->o.getPago())
                .sum();
        return subTotal;
    }
    
    
}
