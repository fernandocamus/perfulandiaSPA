package com.perfulandia.perfulandiaSPA.gestionEnvios.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Envio {
    private String direccion;
    private String ciudad;
    private String region;
    private String codigoPostal;
    private String nombreDestinatario;
    private String fechaEnvio;
    private String estadoEnvio;
}
