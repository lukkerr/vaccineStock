package com.example.api.controller;

import com.example.api.model.Fornecedor;
import com.example.api.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

  @Autowired
  private FornecedorService fornecedorService;

  @GetMapping("/")
  public List<Fornecedor> getFornecedores() {
    return this.fornecedorService.getFornecedores();
  }

  @PostMapping("/") @PutMapping("/")
  public Fornecedor saveFornecedor(@RequestBody Fornecedor fornecedor) {
    return this.fornecedorService.saveFornecedor(fornecedor);
  }

}
