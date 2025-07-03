package com.Reporte.dto;

import org.springframework.hateoas.RepresentationModel;

public class ReporteDTO extends RepresentationModel<ReporteDTO>{
    private String tipo;
    private String descripcion;
    private Double total;

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}