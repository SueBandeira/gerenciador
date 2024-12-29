package com.meuestoque.gerenciador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = Item.TABLE_NAME)
public class Item {

  public static final String TABLE_NAME = "item";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private Long id;

  @NotEmpty
  @Column(name = "nome", length = 100, nullable = false)
  private String nome;

  @NotEmpty
  @Column(name = "categoria", length = 50, nullable = false, unique = false)
  private String categoria;

  @Positive
  @Column(name = "quantidade")
  private int quantidade;

  @NotNull
  @Column(name = "datavalidade", nullable = false)
  private LocalDate dataValidade;

  @NotEmpty
  @Column(name = "localarmazenamento", length = 100, nullable = false)
  private String localArmazenamento;

  // Getters e Setters. Possui a dependência Lombok, mas coloquei  para estudos futuros
  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }

  public String getNome() { return nome; }
  public void setNome(String nome) { this.nome = nome; }

  public String getCategoria() { return categoria; }
  public void setCategoria(String categoria) { this.categoria = categoria; }

  public Integer getQuantidade() { return quantidade; }
  public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

  public LocalDate getDataValidade() { return dataValidade; }
  public void setDataValidade(LocalDate dataValidade) { this.dataValidade = dataValidade; }

  public String getLocalArmazenamento() { return localArmazenamento; }
  public void setLocalArmazenamento(String localArmazenamento) { this.localArmazenamento = localArmazenamento; }

  // Construtores
  public Item() {}

  public Item(Long id, String nome, String categoria, Integer quantidade, LocalDate dataValidade, String localArmazenamento) {
    this.id = id;
    this.nome = nome;
    this.categoria = categoria;
    this.quantidade = quantidade;
    this.dataValidade = dataValidade;
    this.localArmazenamento = localArmazenamento;
  }

  public Item(String nome, String categoria, Integer quantidade, LocalDate dataValidade, String localArmazenamento) {
    this.nome = nome;
    this.categoria = categoria;
    this.quantidade = quantidade;
    this.dataValidade = dataValidade;
    this.localArmazenamento = localArmazenamento;
  }
}


