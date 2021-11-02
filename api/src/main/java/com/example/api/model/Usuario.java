package com.example.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String nome;
  private boolean is_admin;
  private String senha;

  @Column(unique = true)
  private String cpf;

  @Column(unique = true)
  private Long matricula;

}
