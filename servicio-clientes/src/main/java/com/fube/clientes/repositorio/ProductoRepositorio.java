package com.fube.clientes.repositorio;

import com.fube.clientes.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long> {

}