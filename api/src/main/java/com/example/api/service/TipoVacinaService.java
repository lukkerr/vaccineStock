package com.example.api.service;

import com.example.api.model.TipoVacina;
import com.example.api.repository.TipoVacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoVacinaService {

  @Autowired
  private TipoVacinaRepository tipoVacinaRepository;

  public List<TipoVacina> getTiposVacina() {
    return this.tipoVacinaRepository.getTiposVacina();
  }

  public TipoVacina saveTipoVacina(TipoVacina tipoVacina) {
    return this.tipoVacinaRepository.save(tipoVacina);
  }
}
