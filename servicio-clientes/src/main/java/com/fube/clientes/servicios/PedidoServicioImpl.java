package com.fube.clientes.servicios;


import com.fube.clientes.dto.PedidoDTO;
import com.fube.clientes.excepciones.PedidoNoEncontradoExcepcion;
import com.fube.clientes.mapper.ProductoMapper;
import com.fube.clientes.modelos.Producto;
import com.fube.clientes.repositorio.ProductoRepositorio;
import org.springframework.stereotype.Service;

@Service
public class PedidoServicioImpl implements PedidoServicio {

    private final ProductoRepositorio repoPedido;

    public PedidoServicioImpl(ProductoRepositorio repoPedido) {
        this.repoPedido = repoPedido;
    }

    @Override
    public PedidoDTO buscarPorId (Long Id) {
        return repoPedido.findById(Id)
                .map(ProductoMapper::toDTO)
                .orElseThrow(() -> new PedidoNoEncontradoExcepcion(Id));

    }

}