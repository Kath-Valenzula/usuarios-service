package com.example.usuariosservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usuariosservice.model.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    // Lista en memoria para simular los datos de usuarios
    private final List<Usuario> usuarios = new ArrayList<>();

    // Constructor: inicializa la lista con al menos 3 registros
    public UsuarioController() {
        usuarios.add(new Usuario(1, "Ana Martínez", "ana.mtz@mail.com", "dueño de mascota"));
        usuarios.add(new Usuario(2, "Carlos Pérez", "carlos.p@mail.com", "conductor de transporte pet-friendly"));
        usuarios.add(new Usuario(3, "Laura Gómez", "laura.gomez@mail.com", "dueño de mascota"));
    }

    // GET /usuarios: lista todos los usuarios
    @GetMapping
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    // GET /usuarios/{id}: busca y devuelve un usuario por su ID
    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable int id) {
        return usuarios.stream()
                .filter(usuario -> usuario.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
