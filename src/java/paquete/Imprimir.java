/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author casa
 */
@ManagedBean
@RequestScoped
public class Imprimir {

    @Inject
    Saludo saludo;
    private String nombre;
    private String saludation;

    public Imprimir() {
    }

    public void crearSaludation() {
        this.saludation = saludo.saludo(nombre);
    }

    public String getSaludation() {
        return saludation;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
