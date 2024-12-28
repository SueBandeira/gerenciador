package com.meuestoque.gerenciador.repository;

import com.meuestoque.gerenciador.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}