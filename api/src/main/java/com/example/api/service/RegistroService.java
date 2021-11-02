package com.example.api.service;

import com.example.api.model.Registro;
import com.example.api.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroService {

  @Autowired
  private RegistroRepository registroRepository;

  public List<Registro> getRegistros() {
    return this.registroRepository.getRegistros();
  }

  public Registro saveRegistro(Registro registro) {
    return this.registroRepository.save(registro);
  }
}
