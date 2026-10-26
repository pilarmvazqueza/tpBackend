package com.fube.clientes.mapper;


import com.fube.clientes.dto.PedidoDTO;
import com.fube.clientes.modelos.Pedido;

public class PedidoMapper {

    public static PedidoDTO toDTO(Pedido pedido) {

        return PedidoDTO.builder()
                .id(pedido.getId())
                .clienteId(pedido.getClienteId())
                .estado(pedido.getEstado())
                .montoTotal(pedido.getMontoTotal())
                .fechaCreacion(pedido.getFechaCreacion())
                .fechaActualizacion(pedido.getFechaActualizacion())
                .build();

    }

    public static Pedido toEntity(PedidoDTO pedidoDTO) {
        return Pedido.builder()
                .id(pedidoDTO.getId())
                .clienteId(pedidoDTO.getClienteId())
                .estado(pedidoDTO.getEstado())
                .montoTotal(pedidoDTO.getMontoTotal())
                .fechaCreacion(pedidoDTO.getFechaCreacion())
                .fechaActualizacion(pedidoDTO.getFechaActualizacion())
                .build();
    }
}
