package com.medireport.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "campanas_medicas")
public class CampanaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "id_supervisor")
    private String idSupervisor;
    private String ubicacion;
    private String horario;

    @ManyToOne
    @JoinColumn(name = "id_supervisor", insertable = false, updatable = false)
    private Supervisor supervisor;

    @OneToMany(mappedBy = "campanaMedica")
    private List<Atencion> atenciones;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(String idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public List<Atencion> getAtenciones() {
        return atenciones;
    }

    public void setAtenciones(List<Atencion> atenciones) {
        this.atenciones = atenciones;
    }
}
