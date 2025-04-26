package com.duoc.usuarioservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USUARIO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El rol es obligatorio")
    private String rol;

    @Email(message = "Debe ser un correo válido")
    @NotBlank(message = "El correo electrónico es obligatorio")
    private String correo;
}
