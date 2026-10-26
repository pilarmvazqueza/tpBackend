package com.fube.clientes.mapper;

import com.fube.clientes.dto.ReservaDTO;
import com.fube.clientes.modelos.Reserva;

public class ReservaMapper {
    public static ReservaDTO toDTO(Reserva reserva) {

        return ReservaDTO.builder()
                .id(reserva.getId())
                .producto(reserva.getProducto())
                .pedido(reserva.getPedido())
                .cantidad(reserva.getCantidad())
                .estado(reserva.getEstado())
                .build();

    }

    public static Reserva toEntity(ReservaDTO reservaDTO) {
        return Reserva.builder()
                .id(reservaDTO.getId())
                .producto(reservaDTO.getProducto())
                .pedido(reservaDTO.getPedido())
                .cantidad(reservaDTO.getCantidad())
                .estado(reservaDTO.getEstado())
                .build();
    }
}
