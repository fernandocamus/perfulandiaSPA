package com.perfulandia.perfulandiaSPA.gestionCorreos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Correo {
    private String destinatario;
    private String asunto; 
    private String cuerpo;
    private String ArchivoAdjunto;

}
