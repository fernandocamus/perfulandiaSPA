package com.perfulandia.perfulandiaSPA.GestionPedidos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pedido {
    private double totalCompra;
    private String direccion;
    private String ciudad;
    private String region;
    private String codigoPostal;
    private String nombreDestinatario;
    private String metodoPago;
}
