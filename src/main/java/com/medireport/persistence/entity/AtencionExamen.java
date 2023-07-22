package com.medireport.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "atenciones_examenes")
public class AtencionExamen {

    @EmbeddedId
    private AtencionExamenPK id;
    private Double resultado;
    private String comentario;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "id_atencion", insertable = false, updatable = false)
    private Atencion atencion;

    @ManyToOne
    @JoinColumn(name = "id_examen", insertable = false, updatable = false)
    private Examen examen;


    public AtencionExamenPK getId() {
        return id;
    }

    public void setId(AtencionExamenPK id) {
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

    public Atencion getAtencion() {
        return atencion;
    }

    public void setAtencion(Atencion atencion) {
        this.atencion = atencion;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }
}
