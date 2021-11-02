package com.example.api.controller;

import com.example.api.model.TipoVacina;
import com.example.api.service.TipoVacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tiposvacina")
public class TipoVacinaController {

  @Autowired
  private TipoVacinaService tipoVacinaService;

  @GetMapping("/")
  public List<TipoVacina> getTiposVacina() {
    return this.tipoVacinaService.getTiposVacina();
  }

  @PostMapping("/") @PutMapping("/")
  public TipoVacina saveTipoVacina(@RequestBody TipoVacina TipoVacina) {
    return this.tipoVacinaService.saveTipoVacina(TipoVacina);
  }

}
