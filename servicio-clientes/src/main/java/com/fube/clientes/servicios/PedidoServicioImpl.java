package com.fube.clientes.servicios;


import com.fube.clientes.dto.PedidoDTO;
import com.fube.clientes.excepciones.PedidoNoEncontradoExcepcion;
//import com.fube.clientes.mapper.ProductoMapper;
//import com.fube.clientes.modelos.Producto;
//import com.fube.clientes.repositorio.ProductoRepositorio;
import com.fube.clientes.repositorio.PedidoRepositorio;
import com.fube.clientes.mapper.PedidoMapper;
import org.springframework.stereotype.Service;

@Service
public class PedidoServicioImpl implements PedidoServicio {

    private final PedidoRepositorio repoPedido;

    public PedidoServicioImpl(PedidoRepositorio repoPedido) {
        this.repoPedido = repoPedido;
    }

    @Override
    public PedidoDTO buscarPorId (Long Id) {
        return repoPedido.findById(Id)
                .map(PedidoMapper::toDTO)
                .orElseThrow(() -> new PedidoNoEncontradoExcepcion(Id));

    }

}
