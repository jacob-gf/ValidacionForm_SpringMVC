/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacob.modelos;

/**
 *
 * @author jacobh
 */
public class Persona {
    
    private String id;
    private String nombre;
    private String apellido;
    private int pais;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    
    
    
    
}
