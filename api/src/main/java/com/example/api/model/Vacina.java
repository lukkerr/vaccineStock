package com.example.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter @Setter
public class Vacina {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Long id_tipo;
  private Long id_fornecedor;
  private Date data_vencimento;
  private String lote;

}
