package com.example.api.repository;

import com.example.api.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FornecedorRepository extends JpaRepository<Fornecedor,Long> {

  @Query("SELECT f FROM Fornecedor f")
  List<Fornecedor> getFornecedores();
}
