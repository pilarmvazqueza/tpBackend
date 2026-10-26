package com.fube.clientes.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "estadoReservas")
public class EstadoReserva {
    String ACTIVA;
    String LIBERADA;
}