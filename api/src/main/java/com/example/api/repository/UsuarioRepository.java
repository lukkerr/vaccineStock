package com.example.api.repository;

import com.example.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

  @Query("SELECT u FROM Usuario u")
  List<Usuario> getUsuarios();
}
