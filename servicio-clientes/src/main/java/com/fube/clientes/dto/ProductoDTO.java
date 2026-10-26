package com.fube.clientes.dto;

public class ProductoDTO {
    private Long id;

    private String nombre;

    private Integer cantidadDisponible;


    //constructores

    public ProductoDTO() {
    }

    public ProductoDTO(Long id, String nombre, Integer cantidadDisponible) {
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
