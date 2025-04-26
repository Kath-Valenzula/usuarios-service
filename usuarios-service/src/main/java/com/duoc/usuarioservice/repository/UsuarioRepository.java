package com.duoc.usuarioservice.repository;

import com.duoc.usuarioservice.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
