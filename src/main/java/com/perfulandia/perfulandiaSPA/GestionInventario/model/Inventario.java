package com.perfulandia.perfulandiaSPA.GestionInventario.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Inventario {
    private String idProducto;
    private String nombre;
    private String descripcion;
    private String categoria;
    private double precio;
    private String existencias;

}
