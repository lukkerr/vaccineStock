package com.example.api.repository;

import com.example.api.model.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RegistroRepository extends JpaRepository<Registro,Long> {

  @Query("SELECT r FROM Registro r")
  List<Registro> getRegistros();
}
