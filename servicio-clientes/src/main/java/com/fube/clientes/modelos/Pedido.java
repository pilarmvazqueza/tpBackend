package com.fube.clientes.modelos;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cliente_id", nullable = false)
    private Integer clienteId;

    @Column(nullable = false)
    private EstadoPedido estado;

    @Column(nullable = false)
    private double montoTotal;

    @Column(nullable = false)
    private Date fechaCreacion;

    @Column(nullable = false)
    private Date fechaActualizacion;


    //constructores


    public Pedido() {
    }

    public Pedido(Long id, Integer clienteId, EstadoPedido estado,
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
