package com.medireport.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "detalles")
public class Detalle {

    @EmbeddedId
    private DetallePK id;
    private Double resultado;
    private String comentario;

    @ManyToOne
    @MapsId("idPedido")
    @JoinColumn(name = "id_pedido", insertable = false, updatable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "id_examen", insertable = false, updatable = false)
    private Examen examen;


    public DetallePK getId() {
        return id;
    }

    public void setId(DetallePK id) {
        this.id = id;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }
}
