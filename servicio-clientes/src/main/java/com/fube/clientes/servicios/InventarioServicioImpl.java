package com.fube.clientes.servicios;


import com.fube.clientes.dto.ProductoDTO;
import com.fube.clientes.excepciones.ProductoNoEncontradoExcepcion;
import com.fube.clientes.mapper.ProductoMapper;
import com.fube.clientes.modelos.Producto;
import com.fube.clientes.repositorio.ProductoRepositorio;
import org.springframework.stereotype.Service;

@Service
public class InventarioServicioImpl implements InventarioServicio {

    private final ProductoRepositorio repoProducto;

    public InventarioServicioImpl(ProductoRepositorio repoProducto) {
        this.repoProducto = repoProducto;
    }

    @Override
    public ProductoDTO consultarStock(Long Id) {
        return repoProducto.findById(Id)
                .map(ProductoMapper::toDTO)
                .orElseThrow(() -> new ProductoNoEncontradoExcepcion(Id));

    }

}
