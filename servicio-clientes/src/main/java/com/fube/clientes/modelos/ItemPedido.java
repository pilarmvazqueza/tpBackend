package com.fube.clientes.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "itemPedidos")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Pedido pedido;

    @Column(nullable = false)
    private Producto producto;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false)
    private Double precioUnitario;


    //constructores
    public ItemPedido() {
    }

    public ItemPedido(Long id, Pedido pedido, Producto producto, Integer cantidad, Double precioUnitario) {
        this.id = id;
        this.pedido=pedido;
        this.producto=producto;
        this.cantidad=cantidad;
        this.precioUnitario=precioUnitario;
    }


    //getters
    public Long getId() {
        return id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }




    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}