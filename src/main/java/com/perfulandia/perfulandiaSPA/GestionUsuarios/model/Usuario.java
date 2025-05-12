package com.perfulandia.perfulandiaSPA.GestionUsuarios.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
    private String idUsuario;
    private String nombreUsuario;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String correo;
    private String contrasena;

}
