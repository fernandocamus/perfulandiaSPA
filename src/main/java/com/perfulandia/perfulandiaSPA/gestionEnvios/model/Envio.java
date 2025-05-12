package com.perfulandia.perfulandiaSPA.gestionEnvios.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Envio {
    private String direccionEnvio;
    private String ciudadEnvio;
    private String regionEnvio;
    private String nombreDestinatario;
}
