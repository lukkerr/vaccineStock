package com.example.api.service;

import com.example.api.model.Fornecedor;
import com.example.api.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

  @Autowired
  private FornecedorRepository fornecedorRepository;

  public List<Fornecedor> getFornecedores() {
    return this.fornecedorRepository.getFornecedores();
  }

  public Fornecedor saveFornecedor(Fornecedor fornecedor) {
    return this.fornecedorRepository.save(fornecedor);
  }
}
