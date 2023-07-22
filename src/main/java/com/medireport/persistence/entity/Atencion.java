package com.medireport.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "atenciones")
public class Atencion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_paciente")
    private String idPaciente;

    @Column(name = "id_asesor")
    private String idAsesor;

    @Column(name = "id_campana")
    private Integer idCampana;

    @Column(name = "cantidad_tiras")
    private Integer cantidadTiras;

    @Column(name = "fecha_atencion")
    private LocalDateTime fechaAtencion;

    @ManyToOne
    @JoinColumn(name = "id_asesor", insertable = false, updatable = false)
    private Asesor asesor;

    @ManyToOne
    @JoinColumn(name = "id_paciente", insertable = false, updatable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_campana", insertable = false, updatable = false)
    private CampanaMedica campanaMedica;

    @OneToMany(mappedBy = "atencion", cascade = {CascadeType.ALL})
    private List<AtencionExamen> examenes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getIdAsesor() {
        return idAsesor;
    }

    public void setIdAsesor(String idAsesor) {
        this.idAsesor = idAsesor;
    }

    public Integer getIdCampana() {
        return idCampana;
    }

    public void setIdCampana(Integer idCampana) {
        this.idCampana = idCampana;
    }

    public Integer getCantidadTiras() {
        return cantidadTiras;
    }

    public void setCantidadTiras(Integer cantidadTiras) {
        this.cantidadTiras = cantidadTiras;
    }

    public LocalDateTime getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(LocalDateTime fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public Asesor getAsesor() {
        return asesor;
    }

    public void setAsesor(Asesor asesor) {
        this.asesor = asesor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public CampanaMedica getCampanaMedica() {
        return campanaMedica;
    }

    public void setCampanaMedica(CampanaMedica campanaMedica) {
        this.campanaMedica = campanaMedica;
    }

    public List<AtencionExamen> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<AtencionExamen> examenes) {
        this.examenes = examenes;
    }
}
