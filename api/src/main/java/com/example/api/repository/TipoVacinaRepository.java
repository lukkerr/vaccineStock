package com.example.api.repository;

import com.example.api.model.TipoVacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TipoVacinaRepository extends JpaRepository<TipoVacina,Long> {

  @Query("SELECT t FROM TipoVacina t")
  List<TipoVacina> getTiposVacina();
}
