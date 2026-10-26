package com.fube.clientes.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Integer cantidadDisponible;


    //constructores

    public Producto() {
    }

    public Producto(Long id, String nombre, Integer cantidadDisponible) {
        this.id = id;
        this.nombre=nombre;
        this.cantidadDisponible=cantidadDisponible;
    }


    //getters

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }


    //setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}