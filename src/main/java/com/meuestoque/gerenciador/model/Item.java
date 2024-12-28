package com.meuestoque.gerenciador.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Item {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String categoria;
  private int quantidade;
  private LocalDate dataValidade;
  private String localArmazenamento;

  //Preferi colocar os getteres e setteres para treinar, mas pode ser usado o Lombook
  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }

  public String getNome() { return nome; }
  public void setNome(String nome) { this.nome = nome; }

  public String getCategoria() { return categoria; }
  public void setCategoria(String categoria) { this.categoria = categoria; }

  public int getQuantidade() { return quantidade; }
  public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

  public LocalDate getDataValidade() { return dataValidade; }
  public void setDataValidade(LocalDate dataValidade) { this.dataValidade = dataValidade; }

  public String getLocalArmazenamento() { return localArmazenamento; }
  public void setLocalArmazenamento(String localArmazenamento) { this.localArmazenamento = localArmazenamento; }
}

