package com.medireport.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "id_paciente")
    private String pacienteId;


    @Column(name = "id_asesor")
    private String asesorId;


    private LocalDateTime fecha;

    //RELACION DE UNO A MUCHOS CON LA TABLA DETALLE, OBTENIENDO LA LISTA DE EXAMENES DEL PEDIDO
    @OneToMany(mappedBy = "pedido", cascade = {CascadeType.ALL})
    private List<Detalle> examenes;

    //RELACION DE MUCHOS A UNO CON LA TABLA ASESORES
    @ManyToOne
    @JoinColumn(name = "id_asesor", insertable = false, updatable = false)
    private Asesor asesor;

    //RELACION DE MUCHOS A UNO CON LA TABLA PACIENTES
    @ManyToOne
    @JoinColumn(name = "id_paciente", insertable = false, updatable = false)
    private Paciente paciente;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(String pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getAsesorId() {
        return asesorId;
    }

    public void setAsesorId(String asesorId) {
        this.asesorId = asesorId;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public List<Detalle> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<Detalle> examenes) {
        this.examenes = examenes;
    }
}
