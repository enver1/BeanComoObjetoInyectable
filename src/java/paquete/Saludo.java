/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

//import javax.enterprise.inject.Default;

@javax.enterprise.context.RequestScoped

/**
 *
 * @author casa
 */

//@Default
public class Saludo {
    
    public String saludo(String nombre){
        return "Hola, "+nombre+".";
    }
    
}
