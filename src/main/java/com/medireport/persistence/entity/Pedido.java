package com.medireport.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idPedido;

    @Column(name = "id_asesor")
    private String idAsesor;

    @Column(name = "id_paciente")
    private String idPaciente;
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "id_asesor", insertable = false, updatable = false)
    private Asesor asesor;


    @ManyToOne
    @JoinColumn(name = "id_paciente", insertable = false, updatable = false)
    private Paciente paciente;


    @OneToMany(mappedBy = "pedido", cascade = {CascadeType.ALL})
    private List<Detalle> examenes;

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getIdAsesor() {
        return idAsesor;
    }

    public void setIdAsesor(String idAsesor) {
        this.idAsesor = idAsesor;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
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

    public List<Detalle> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<Detalle> examenes) {
        this.examenes = examenes;
    }
}
