package com.fube.clientes.servicios;


public class PedidoServicio {

    private final ProductoRepositorio repoPedido;

    public Integer buscarPorId (Integer Id) {
        Producto producto= repoPedido.findById(Id)
                .orElseThrow(() -> new PedidoNoEncontradoExcepcion(Id));

    }

}