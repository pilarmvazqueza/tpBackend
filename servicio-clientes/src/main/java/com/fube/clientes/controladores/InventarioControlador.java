package com.fube.clientes.controladores;

import com.fube.clientes.servicios.InventarioServicio;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/api/inventario")
public class InventarioControlador {

    private final InventarioServicio servicio;


    public InventarioControlador(InventarioServicio servicio) {
        this.servicio = servicio;
    }
}