package com.example.miapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.miapi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // No hace falta escribir código aquí: Spring genera todos los métodos CRUD automáticamente.
}
