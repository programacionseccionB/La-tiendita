/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latiendita1;

import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class Usuarios {
    private String user;
    private String pass;

    public Usuarios() {
        this.user = "";
        this.pass = "";
    }
    
    
    
    public int verificarUsuario(String usuario,String password){
        int num = 0;
        this.user = usuario;
        this.pass = password;
        
        if(this.user.equals("admin1")&&this.pass.equals("12345")){
            num = 1;
        }else if(this.user.equals("empleado1")&&this.pass.equals("123")){
            num = 2;
        }else{
            JOptionPane.showMessageDialog(null, "El usuario: "+usuario+
                    " no existe / password incorrecto");
        }
        return num;
    }
}
