package com.medireport.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_asesor", insertable = false, updatable = false )
    private Asesor asesor;
    @ManyToOne
    @JoinColumn(name = "id_paciente", insertable = false, updatable = false )
    private Paciente paciente;


    @OneToMany(mappedBy = "pedido")
    private List<Detalle> examenes;

    private Integer cantidad;

    private LocalDateTime fecha;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
