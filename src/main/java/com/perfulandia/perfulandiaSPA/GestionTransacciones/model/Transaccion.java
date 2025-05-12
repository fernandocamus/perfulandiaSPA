package com.perfulandia.perfulandiaSPA.GestionTransacciones.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Transaccion {
    private String idTransaccion;
    private String idUsuario; // No se si se necesita, ya que es de la clase Usuario
    private String idProducto; // No se si se necesita, ya que es de la clase Inventario
    private String fechaTransaccion;
    private double monto;
    private String metodoPago;
    private String estadoTransaccion;
}
