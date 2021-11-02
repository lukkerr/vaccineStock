package com.example.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
public class Registro {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Long id_vacina;

  private Long id_usuario_entrada;
  private Date data_entrada;

  private Long id_usuario_saida;
  private Date data_saida;
  private String descricao_saida;

}
