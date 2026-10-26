package com.fube.clientes.controladores;

import com.fube.clientes.servicios.InventarioServicioImpl;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/api/inventario")
public class InventarioControlador {

    private final InventarioServicioImpl servicio;


    public InventarioControlador(InventarioServicioImpl servicio) {
        this.servicio = servicio;
    }


}