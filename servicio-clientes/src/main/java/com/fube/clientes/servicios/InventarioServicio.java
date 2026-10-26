package com.fube.clientes.servicios;

import com.fube.clientes.dto.ProductoDTO;

public interface InventarioServicio {

    Integer consultarStock (Long Id);
}
