package com.meuestoque.gerenciador.controller;

import com.meuestoque.gerenciador.model.Item;
import com.meuestoque.gerenciador.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/itens")
public class ItemController {

  @Autowired
  private ItemService itemService;

  @GetMapping
  public List<Item> listarTodos() {
    return itemService.listarTodos();
  }

  @GetMapping("/{id}")
  public Item buscarPorId(@PathVariable Long id) {
    return itemService.buscarPorId(id).orElseThrow(() -> new RuntimeException("Item não encontrado"));
  }

  @PostMapping
  public Item adicionarItem(@RequestBody Item item) {
    return itemService.salvarItem(item);
  }

  @PutMapping("/{id}")
  public Item atualizarItem(@PathVariable Long id, @RequestBody Item item) {
    item.setId(id);
    return itemService.salvarItem(item);
  }

  @DeleteMapping("/{id}")
  public void deletarItem(@PathVariable Long id) {
    itemService.deletarItem(id);
  }
}
