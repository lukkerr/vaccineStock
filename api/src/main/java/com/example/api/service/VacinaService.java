package com.example.api.service;

import com.example.api.model.Vacina;
import com.example.api.repository.VacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacinaService {

  @Autowired
  private VacinaRepository vacinaRepository;

  public List<Vacina> getVacinas() {
    return this.vacinaRepository.getVacinas();
  }

  public Vacina saveVacina(Vacina vacina) {
    return this.vacinaRepository.save(vacina);
  }
}
