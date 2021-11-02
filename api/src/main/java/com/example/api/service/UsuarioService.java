package com.example.api.service;

import com.example.api.model.Usuario;
import com.example.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

  @Autowired
  private UsuarioRepository usuarioRepository;

  public List<Usuario> getUsuarios() {
    return this.usuarioRepository.getUsuarios();
  }

  public Usuario saveUsuario(Usuario usuario) {
    return this.usuarioRepository.save(usuario);
  }
}
