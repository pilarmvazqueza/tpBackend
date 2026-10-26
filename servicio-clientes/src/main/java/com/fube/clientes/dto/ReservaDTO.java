package com.fube.clientes.dto;

import com.fube.clientes.modelos.EstadoReserva;
import com.fube.clientes.modelos.Pedido;
import com.fube.clientes.modelos.Producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservaDTO {
    private Long id;

    private Producto producto;

    private Pedido pedido;

    private Integer cantidad;

    private EstadoReserva estado;


    //getters

    public Long getId() {
        return id;
    }

    public Producto getProducto() {
        return producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public EstadoReserva getEstado() {
        return estado;
    }


    //setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }
}
