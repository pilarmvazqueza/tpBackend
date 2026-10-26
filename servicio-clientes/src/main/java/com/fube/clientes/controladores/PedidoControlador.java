package com.fube.clientes.controladores;

import com.fube.clientes.dto.PedidoDTO;
import com.fube.clientes.servicios.PedidoServicio;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/pedidos")
public class PedidoControlador {

    private final PedidoServicio servicio;

    public PedidoControlador(PedidoServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/{id}")
    public PedidoDTO buscarPorId(@PathVariable Long id) {
        return servicio.buscarPorId(id);
    }


}