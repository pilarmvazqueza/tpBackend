package com.fube.clientes.servicios;

import com.fube.clientes.repositorio.ProductoRepositorio;
import com.fube.clientes.repositorio.ReservaRepositorio;
@Service
public class InventarioServicio {

    private final ProductoRepositorio repoProducto;
    private final ReservaRepositorio repoReserva;

    public Integer consultarStock (Integer Id) {
        Producto producto= repoProducto.findById(Id)
                .orElseThrow(() -> new ProductoNoEncontradoExcepcion(Id));

    }
}