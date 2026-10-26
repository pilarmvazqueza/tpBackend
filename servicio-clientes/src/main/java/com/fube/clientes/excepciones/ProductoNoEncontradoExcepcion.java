package com.fube.clientes.excepciones;

public class ProductoNoEncontradoExcepcion extends RuntimeException {
    public ProductoNoEncontradoExcepcion(Long Id) {
        super("Producto no encontrado con id: " + Id);
    }
}
