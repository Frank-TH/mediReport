package com.medireport.persistence.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DetallePK implements Serializable {
    private Integer id_pedido;
    private Integer id_examen;

    public Integer getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Integer getId_examen() {
        return id_examen;
    }

    public void setId_examen(Integer id_examen) {
        this.id_examen = id_examen;
    }
}
