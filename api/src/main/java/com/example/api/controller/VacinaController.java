package com.example.api.controller;

import com.example.api.model.Vacina;
import com.example.api.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vacinas")
public class VacinaController {

  @Autowired
  private VacinaService vacinaService;

  @GetMapping("/")
  public List<Vacina> getVacinas() {
    return this.vacinaService.getVacinas();
  }

  @PostMapping("/") @PutMapping("/")
  public Vacina saveVacina(@RequestBody Vacina Vacina) {
    return this.vacinaService.saveVacina(Vacina);
  }

}
