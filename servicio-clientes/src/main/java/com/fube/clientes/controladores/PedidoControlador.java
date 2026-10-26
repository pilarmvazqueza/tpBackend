package com.fube.clientes.controladores;

@RestController()
@RequestMapping("/api/pedidos")
public class PedidoControlador {

    public servicioPedido= PedidoServicio servicio;

    @GetMapping("/{id}")
    public PedidoDTO buscarPorId(@PathVariable Long id) {
        return servicio.buscarPorId(id);
    }


}