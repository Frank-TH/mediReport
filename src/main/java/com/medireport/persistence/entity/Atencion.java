package com.medireport.persistence.entity;

import javax.persistence.*;

@Entity
public class Atencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_asesor", insertable = false, updatable = false )
    private Asesor asesor;

    @ManyToOne
    @JoinColumn(name = "id_supervisor", insertable = false, updatable = false )
    private Supervisor supervisor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Asesor getAsesor() {
        return asesor;
    }

    public void setAsesor(Asesor asesor) {
        this.asesor = asesor;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }
}
