package com.medireport.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supervisor {

    @Id
    private String dni;
    private String nombre;


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
