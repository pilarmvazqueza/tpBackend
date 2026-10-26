package com.fube.clientes.servicios;


import com.fube.clientes.dto.PedidoDTO;
import com.fube.clientes.excepciones.PedidoNoEncontradoExcepcion;
import com.fube.clientes.modelos.Producto;
import com.fube.clientes.repositorio.ProductoRepositorio;

public class PedidoServicio {

    private final ProductoRepositorio repoPedido;

    public PedidoServicio(ProductoRepositorio repoPedido) {
        this.repoPedido = repoPedido;
    }

    public PedidoDTO buscarPorId (Long Id) {
        Producto producto= repoPedido.findById(Id)
                .orElseThrow(() -> new PedidoNoEncontradoExcepcion(Id));

    }

}