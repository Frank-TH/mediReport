package com.medireport.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "supervisores")
public class Supervisor {

    @Id
    private String dni;
    private String nombres;
    private String clave;
    private String apellidos;
    private String telefono;
    private String correo;
    @Column(name = "fecha_nacimiento")
    private LocalDateTime fechaNacimiento;
    private boolean estado;

    @OneToMany(mappedBy = "supervisor")
    private List<CampanaMedica> campanasMedicas;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<CampanaMedica> getCampanasMedicas() {
        return campanasMedicas;
    }

    public void setCampanasMedicas(List<CampanaMedica> campanasMedicas) {
        this.campanasMedicas = campanasMedicas;
    }
}
