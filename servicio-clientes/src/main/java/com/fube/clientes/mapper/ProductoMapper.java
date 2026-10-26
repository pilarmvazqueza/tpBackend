package com.fube.clientes.mapper;

import com.fube.clientes.dto.ProductoDTO;
import com.fube.clientes.modelos.Producto;

public class ProductoMapper {
    public static ProductoDTO toDTO(Producto producto) {

        return ProductoDTO.builder()
                .id(producto.getId())
                .nombre(producto.getNombre())
                .cantidadDisponible(producto.getCantidadDisponible())
                .build();

    }

    public static Producto toEntity(ProductoDTO productoDTO) {
        return Producto.builder()
                .id(productoDTO.getId())
                .nombre(productoDTO.getNombre())
                .cantidadDisponible(productoDTO.getCantidadDisponible())
                .build();
    }
}
