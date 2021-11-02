package com.example.api.controller;

import com.example.api.model.Usuario;
import com.example.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

  @Autowired
  private UsuarioService usuarioService;

  @GetMapping("/")
  public List<Usuario> getUsuarios() {
    return this.usuarioService.getUsuarios();
  }

  @PostMapping("/") @PutMapping("/")
  public Usuario saveUsuario(@RequestBody Usuario Usuario) {
    return this.usuarioService.saveUsuario(Usuario);
  }

}
