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
public class RegistroProductos {
    ArrayList<Productos> arregloProductos;
    
    public RegistroProductos(){
        arregloProductos = new ArrayList<>();
    }
    
    public void agregarProductos(Productos p){
        arregloProductos.add(p);
    }
    
    public void mostrarArregloProductos(){
        System.out.println("*****Listado de Productos ingresados*****");
        for(Productos p:arregloProductos){
            System.out.println("Descripción: "+p.getDescripcion()+
                    " Costo: "+p.getCosto());
        }
    }
    
    public double subtotalProductos(){
        double subTotal = arregloProductos.stream()
                .mapToDouble(o ->o.getCosto())
                .sum();
        return subTotal;
    }
}
