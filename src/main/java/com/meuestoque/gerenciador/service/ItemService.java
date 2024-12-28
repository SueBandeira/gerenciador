package com.meuestoque.gerenciador.service;

import com.meuestoque.gerenciador.model.Item;
import com.meuestoque.gerenciador.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

  @Autowired
  private ItemRepository itemRepository;

  public List<Item> listarTodos() {
    return itemRepository.findAll();
  }

  public Optional<Item> buscarPorId(Long id) {
    return itemRepository.findById(id);
  }

  public Item salvarItem(Item item) {
    return itemRepository.save(item);
  }

  public void deletarItem(Long id) {
    itemRepository.deleteById(id);
  }
}

