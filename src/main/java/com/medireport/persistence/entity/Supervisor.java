package com.medireport.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Supervisor {

    @Id
    private String dni;
    private String nombre;

    @OneToMany(mappedBy = "supervisor")
    private List<Atencion> atenciones;

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

    public List<Atencion> getAtenciones() {
        return atenciones;
    }

    public void setAtenciones(List<Atencion> atenciones) {
        this.atenciones = atenciones;
    }
}
