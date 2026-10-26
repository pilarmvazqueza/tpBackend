package com.fube.clientes.servicios;

import com.fube.clientes.dto.PedidoDTO;

public interface PedidoServicio {
    PedidoDTO buscarPorId (Long Id);
}
