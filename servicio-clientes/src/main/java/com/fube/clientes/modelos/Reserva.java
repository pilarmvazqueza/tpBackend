package com.fube.clientes.modelos;


@Entity
@Table(name = "reservas")
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


    //constructores
    public Reserva() {
    }

    public Reserva(Long id, Producto producto, Pedido pedido, Integer cantidad, EstadoReserva estado) {
        this.id = id;
        this.producto=producto;
        this.pedido=pedido;
        this.cantidad=cantidad;
        this.estado=estado;
    }


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