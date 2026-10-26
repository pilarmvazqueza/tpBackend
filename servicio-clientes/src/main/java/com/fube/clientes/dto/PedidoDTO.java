package com.fube.clientes.dto;

import com.fube.clientes.modelos.EstadoPedido;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class PedidoDTO {

    private Long id;

    private Integer clienteId;

    private EstadoPedido estado;

    private double montoTotal;

    private Date fechaCreacion;

    private Date fechaActualizacion;


    //constructores


    public PedidoDTO() {
    }

    public PedidoDTO(Long id, Integer clienteId, EstadoPedido estado,
                  double montoTotal, Date fechaCreacion, Date fechaActualizacion) {
        this.id = id;
        this.clienteId=clienteId;
        this.estado=estado;
        this.fechaCreacion=fechaCreacion;
        this.fechaActualizacion=fechaActualizacion;
    }

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