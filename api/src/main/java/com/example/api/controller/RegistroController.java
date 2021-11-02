package com.example.api.controller;

import com.example.api.model.Registro;
import com.example.api.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/registros")
public class RegistroController {

  @Autowired
  private RegistroService registroService;

  @GetMapping("/")
  public List<Registro> getRegistros() {
    return this.registroService.getRegistros();
  }

  @PostMapping("/") @PutMapping("/")
  public Registro saveRegistro(@RequestBody Registro Registro) {
    return this.registroService.saveRegistro(Registro);
  }

}
