package com.fube.clientes.dto;

import com.fube.clientes.modelos.EstadoPedido;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDTO {

    private Long id;

    private Integer clienteId;

    private EstadoPedido estado;

    private double montoTotal;

    private Date fechaCreacion;

    private Date fechaActualizacion;



    //getters
    public Long getId() {
        return id;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}