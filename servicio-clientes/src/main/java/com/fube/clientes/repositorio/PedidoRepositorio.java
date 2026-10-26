package com.fube.clientes.repositorio;

import org.springframework.stereotype.Repository;
import com.fube.clientes.modelos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {

}