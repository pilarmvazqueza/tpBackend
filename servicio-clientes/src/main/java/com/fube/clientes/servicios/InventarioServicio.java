package com.fube.clientes.servicios;

import com.fube.clientes.dto.ProductoDTO;
import com.fube.clientes.excepciones.ProductoNoEncontradoExcepcion;
import com.fube.clientes.modelos.Producto;
import com.fube.clientes.repositorio.ProductoRepositorio;
import com.fube.clientes.repositorio.ReservaRepositorio;
import org.springframework.stereotype.Service;

@Service
public class InventarioServicio {


    private final ProductoRepositorio repoProducto;

    public InventarioServicio(ProductoRepositorio repoProducto) {
        this.repoProducto = repoProducto;
    }

    public ProductoDTO consultarStock (Long Id) {
        Producto producto= repoProducto.findById(Id)
                .orElseThrow(() -> new ProductoNoEncontradoExcepcion(Id));

    }
}