package com.fube.clientes.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "reservas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Producto producto;

    @Column(nullable = false)
    private Pedido pedido;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false)
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