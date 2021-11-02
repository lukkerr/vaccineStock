package com.example.api.repository;

import com.example.api.model.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VacinaRepository extends JpaRepository<Vacina,Long> {

  @Query("SELECT v FROM Vacina v")
  List<Vacina> getVacinas();
}
