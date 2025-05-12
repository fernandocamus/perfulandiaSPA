package com.perfulandia.perfulandiaSPA.GestionPedidos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pedido {
    private String idPedido;
    private String idUsuario; // No se si se necesita, ya que es de la clase Usuario
    private String idProducto; // No se si se necesita, ya que es de la clase Inventario
    private double cantidadProducto;
    private double totalCompra;
    private String direccion;
    private String ciudad;
    private String region;
    private String codigoPostal;
    private String nombreDestinatario;
    private String metodoPago;
}
